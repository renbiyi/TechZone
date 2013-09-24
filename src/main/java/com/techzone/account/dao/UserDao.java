package com.techzone.account.dao;

import com.techzone.account.bo.SysUser;

public interface UserDao {
	
	SysUser findUserByUsername(String username);

	void save(SysUser user);

	void update(SysUser user);

}
