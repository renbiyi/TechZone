package com.techzone.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.techzone.model.User;
import com.techzone.user.service.UserService;
import com.techzone.util.JsonUtil;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "add")
	public String addUser(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		User u = new User();
		u.setUsername("任碧仪");
		u.setPassword("123");
		userService.addUser(u);
		JsonUtil.printJson(response, "addUser");
		return null;
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	@ResponseBody
    public Map<String, Object> save(@ModelAttribute User user) {  
		String username = user.getUsername();
//		log.info(username);
		
		userService.addUser(user);
		
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("username", username);
		
        return jsonMap;  
    }
	
	@RequestMapping(value = "list")
	public String getUserList(HttpServletRequest request, HttpServletResponse response, ModelMap model){
//		JsonUtil.printJson(response, "addUser");
//		JsonResult
//		 ResponseEntity<JsonResult> responseResult = new ResponseEntity<JsonResult>( new JsonResult(true,"return ok"),HttpStatus.OK);
		return null;
	}
	
}
