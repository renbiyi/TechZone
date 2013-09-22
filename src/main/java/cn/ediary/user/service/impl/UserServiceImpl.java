package cn.ediary.user.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cn.ediary.model.User;
import cn.ediary.user.dao.UserDao;
import cn.ediary.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
//	@Autowired
//	private UserDao userDao;
	
	public void addUser(User u) {
//		userDao.addUser(u);
	}

	public List<User> getUserList() {

//		return userDao.getUserList();
		return null;
	}

}
