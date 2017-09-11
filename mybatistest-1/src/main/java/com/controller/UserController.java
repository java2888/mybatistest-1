package com.controller;

 

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.User;
import com.service.UserServiceI;

@Controller
@RequestMapping("userController")
public class UserController {

	private UserServiceI userService;

	public UserServiceI getUserService() {
		return userService;
	}
	
	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/showUser")
	public   String showUser(String id, HttpServletRequest request){
		System.out.println("id="+id);
		User user=userService.getUserById(Integer.valueOf(id));
		request.setAttribute("user", user);
		System.out.println("user="+user.getUsername());
		return "showUser";
		
		
	}
	
}
