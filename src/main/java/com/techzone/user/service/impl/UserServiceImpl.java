package com.techzone.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.techzone.model.User;
import com.techzone.user.dao.UserDao;
import com.techzone.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	public void addUser(User u) {
		userDao.addUser(u);
	}

	public List<User> getUserList() {
//		return userDao.getUserList();
		return null;
	}

}
