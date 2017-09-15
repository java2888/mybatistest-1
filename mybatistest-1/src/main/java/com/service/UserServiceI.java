package com.service;

import java.util.List;

import com.model.User;


public interface UserServiceI {
	public User getUserById(Integer id);
	public List<User> selectAllUser();
	
}
