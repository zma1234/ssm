package com.zma.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zma.dao.UserMapper;
import com.zma.domain.User;
import com.zma.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	
	@Resource
	private UserMapper userMapper;
	
	public User getUserById(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

}
