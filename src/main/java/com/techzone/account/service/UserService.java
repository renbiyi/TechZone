package com.techzone.account.service;

import com.techzone.account.bo.SysUser;

public interface UserService {

	SysUser findUserByUsername(String username);

	Long save(SysUser user);

	void addUserFromPassport(Long uid, String username);
	
}
