package cn.ediary.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.ediary.model.User;

@Component
public interface UserMapper {
	public List<User> getUserList();
	public void addUser(User u);
}
