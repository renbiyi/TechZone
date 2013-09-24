package com.techzone.account.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.techzone.account.bo.SysRole;
import com.techzone.account.bo.SysUser;
import com.techzone.account.bo.SysUserRole;
import com.techzone.account.dao.RoleDao;
import com.techzone.account.dao.UserRoleDao;
import com.techzone.account.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	
	@Autowired
	private UserRoleDao userRoleDao;
	
	@Override
	public List<SysRole> findRolesByUser(SysUser user) {
		Assert.notNull(user.getId(), "userId can't be null.");
		return roleDao.findRolesByUserId(user.getId());
	}

	@Override
	public SysRole findRoleByName(String roleName) {
		Assert.notNull(roleName, "roleName can't be null.");
		return roleDao.findRoleByName(roleName);
	}

	@Override
	public void addRole4User(String roleName, SysUser user) {
		Assert.notNull(user.getId(), "userId can't be null.");
		Assert.notNull(roleName, "roleName can't be null.");
		
		SysRole role = this.findRoleByName(roleName);
		
		Assert.notNull(role, "roleName=" + roleName + " can't be null.");
		
		Long userId = user.getId();
		Long roleId = role.getId();
		
		SysUserRole userRole = new SysUserRole();
		userRole.setUserId(userId);
		userRole.setRoleId(roleId);
		userRoleDao.save(userRole);
		
		return;
	}

}
