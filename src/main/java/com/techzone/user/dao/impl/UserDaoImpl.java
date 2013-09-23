package com.techzone.user.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.techzone.mapper.UserMapper;
import com.techzone.model.User;
import com.techzone.user.dao.UserDao;

@Repository
public  class UserDaoImpl implements UserDao{
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> getUserList() {
		return userMapper.getUserList();
		//return getSqlSession().selectList("getUserList");
	}

	public void addUser(User u) {
		userMapper.addUser(u);
		System.out.println("add user success!!!");
	}

}
