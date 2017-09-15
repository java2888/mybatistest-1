package com.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.model.User;
import com.service.UserServiceI;

/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestMybatis_2 {
	private UserServiceI userService;

	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	@Test
	public void test1() {
		User user = userService.getUserById(1);
		System.out.println(user.getUsername());
	}

	@Test
	public void testSelectAllUser() {
		List<User> list = userService.selectAllUser();
		System.out.println("list<User>.size()=" + list.size());
		for (int i = 0; i < list.size(); i++) {
			StringBuilder strResult = new StringBuilder();
			strResult.append(list.get(i).getUsername() + "; " + list.get(i).getUseremail() + ";"
					+ list.get(i).getUserpassword());

			System.out.println(strResult);
		}
	}

}*/
