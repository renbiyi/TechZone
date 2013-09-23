package com.techzone.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.techzone.model.User;

@Component
public interface UserMapper {
	public List<User> getUserList();
	public void addUser(User u);
}
