package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.User;
import com.service.UserServiceI;

@Controller
//@RequestMapping("userController")
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserServiceI userService;

	public UserServiceI getUserService() {
		return userService;
	}

	
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	@RequestMapping("/showUser")
	public String showUser(String id, HttpServletRequest request) {
		System.out.println("id=" + id);
		User user = userService.getUserById(Integer.valueOf(id));
		request.setAttribute("user", user);
		System.out.println("user=" + user.getUsername());
		return "showUser";

	}

	@RequestMapping("/getAllUser")
	public String selectAllUser(HttpServletRequest request) {
		System.out.println("/getAllUser");
		List<User> list = userService.selectAllUser();
		System.out.println("list" + list.size());
		request.setAttribute("listAllUser", list);

		System.out.println("list<User>.size()=" + list.size());
		for (int i = 0; i < list.size(); i++) {
			StringBuilder strResult = new StringBuilder();
			strResult.append(list.get(i).getUsername() + "; " + list.get(i).getUseremail() + ";"
					+ list.get(i).getUserpassword());

			System.out.println(strResult);
		}
		return "showAllUser";

	}
}
