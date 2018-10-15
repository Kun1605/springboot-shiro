package com.shiroDemo.mapper;

import com.shiroDemo.domain.User;

public interface UserMapper {

	public User findByName(String name);
	
	public User findById(Integer id);
}
