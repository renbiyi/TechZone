package com.techzone.account.service;

import java.util.List;

import com.techzone.account.bo.SysRole;
import com.techzone.account.bo.SysUser;

public interface RoleService {
	
	List<SysRole> findRolesByUser(SysUser user);
	
	SysRole findRoleByName(String roleName);

	void addRole4User(String roleName, SysUser user);

}
