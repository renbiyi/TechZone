package com.techzone.user.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.techzone.account.bo.SysUser;
import com.techzone.account.service.UserService;
import com.techzone.test.util.SpringTransactionalTestCase;

public class UserServiceTest extends SpringTransactionalTestCase {
	
	@Autowired
	private UserService userService;
	
	@Test
	@Rollback(false)
	public void itShouldAddAUser() {
		SysUser u = new SysUser();
		u.setUsername("张浩");
		u.setId(20L);
		
		userService.save(u);
	}

}
