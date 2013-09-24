package com.techzone.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.techzone.account.bo.SysRole;
import com.techzone.account.bo.SysUser;
import com.techzone.account.dao.UserDao;
import com.techzone.account.service.RoleService;
import com.techzone.account.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private RoleService roleService;
	
	@Override
	public SysUser findUserByUsername(String username) {
		Assert.notNull(username, "username can't be null.");
		return userDao.findUserByUsername(username);
	}

	@Override
	public Long save(SysUser user) {
		Assert.notNull(user, "user can't be null.");
		userDao.save(user);
		return user.getId();
	}

	@Override
	public void addUserFromPassport(Long uid, String username) {
		Assert.notNull(uid, "uid can't be null.");
		Assert.notNull(username, "username can't be null.");
		
		SysUser user = new SysUser();
		user.setId(uid);
		user.setUsername(username);
		user.setEnabled(Boolean.TRUE);
		
		this.save(user);
		roleService.addRole4User(SysRole.Role.ROLE_USER.name(), user);
		
		return;
	}

}
