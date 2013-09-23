package com.techzone.user.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techzone.model.User;

@Service
public interface UserService {
	@Transactional  
    public void addUser(User u);
	public List<User> getUserList();
}
