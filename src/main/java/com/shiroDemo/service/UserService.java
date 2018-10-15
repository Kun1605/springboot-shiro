package com.shiroDemo.service;

import com.shiroDemo.domain.User;

public interface UserService {

	public User findByName(String name);
	
	public User findById(Integer id);
}
