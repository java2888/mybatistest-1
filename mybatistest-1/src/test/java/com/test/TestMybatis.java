package com.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;
import com.service.UserServiceI;

public class TestMybatis {
	private ApplicationContext applicationContext;
	private UserServiceI userService;
	
	@Before
	public void Before(){
		applicationContext=new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		userService= (UserServiceI) applicationContext.getBean("userService");		
	}
	
	@Test
	public void test1(){
		User user=userService.getUserById(1);
		System.out.println(user.getUsername());
	}
	
	@Test
	public void test2(){
		
	}
	
}
