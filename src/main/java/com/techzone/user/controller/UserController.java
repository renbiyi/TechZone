package com.techzone.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techzone.model.User;
import com.techzone.user.service.UserService;
import com.techzone.util.JsonUtil;

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
	
	@RequestMapping(value = "/list")
	public String getUserList(HttpServletRequest request, HttpServletResponse response, ModelMap model){
//		JsonUtil.printJson(response, "addUser");
//		JsonResult
//		 ResponseEntity<JsonResult> responseResult = new ResponseEntity<JsonResult>( new JsonResult(true,"return ok"),HttpStatus.OK);
		return null;
	}
	
}
