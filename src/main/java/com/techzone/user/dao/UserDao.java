package com.techzone.user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.techzone.model.User;

@Repository
public interface UserDao {
	
	public List<User> getUserList();
	
	public void addUser(User u);
}
