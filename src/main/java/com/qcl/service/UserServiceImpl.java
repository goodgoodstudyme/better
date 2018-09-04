package com.qcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qcl.dao.UserDao;
import com.qcl.entity.User;
import com.qcl.service.api.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getUser() {
		
		return userDao.getUser();
	}

}
