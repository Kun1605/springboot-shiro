package com.shiroDemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiroDemo.domain.User;
import com.shiroDemo.mapper.UserMapper;
import com.shiroDemo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	//注入Mapper接口
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User findByName(String name) {
		return userMapper.findByName(name);
	}

	@Override
	public User findById(Integer id) {
		return userMapper.findById(id);
	}

	
}
