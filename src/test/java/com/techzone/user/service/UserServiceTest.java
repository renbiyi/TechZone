package com.techzone.user.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.techzone.model.User;
import com.techzone.test.util.SpringTransactionalTestCase;

public class UserServiceTest extends SpringTransactionalTestCase {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void itShouldAddAUser() {
		User u = new User();
		u.setUsername("张浩");
		u.setPassword("ddd");
		
		userService.addUser(u);
	}

}
