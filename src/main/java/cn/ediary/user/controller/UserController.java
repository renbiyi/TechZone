package cn.ediary.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ediary.model.User;
import cn.ediary.user.service.UserService;
import cn.ediary.util.JsonUtil;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/add")
	public String addUser(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		User u = new User();
		u.setUsername("任碧仪");
		u.setPassword("123");
		userService.addUser(u);
		JsonUtil.printJson(response, "addUser");
		return null;
	}
	
}
