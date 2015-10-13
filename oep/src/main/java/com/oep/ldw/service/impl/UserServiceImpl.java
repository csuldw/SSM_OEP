package com.oep.ldw.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.oep.ldw.dao.IUserDao;
import com.oep.ldw.pojo.User;
import com.oep.ldw.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}
