package com.demo.dao;

import com.demo.beans.User;

public interface UserDao {
	User getUser(String username, String password);

}
