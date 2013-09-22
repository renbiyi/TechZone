package cn.ediary.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ediary.user.service.UserService;

@Controller
public class CommonController {
	
	@Autowired
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value = "")
	public String index(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		return "/index";
	}

	@RequestMapping(value = "/index")
	public String indexPrefix(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		return "/index";
	}
}
