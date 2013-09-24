package com.techzone.portal.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortalAction {

	@RequestMapping(value = "")
	public String index(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		return "/index";
	}

	@RequestMapping(value = "/index")
	public String indexPrefix(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		return "/index";
	}
}
