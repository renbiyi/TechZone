package com.techzone.user.dao;

import java.util.List;

import com.techzone.model.User;

public interface UserDao {
	
	public List<User> getUserList();
	
	public void addUser(User u);
}
