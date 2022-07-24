package com.demo.service;

import com.demo.beans.User;
import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
	 private UserDao userDao;

	public UserServiceImpl() {
		userDao = new UserDaoImpl();
	}
	@Override
	public User validateUser(String username, String password) {
		User user = userDao.getUser(username,password);
			if(user!=null) {
			if((user.getUname().equals(username)) && (user.getPass().equals(password))) {
					return user;
				}
		
		}
		return null;
	}

}
