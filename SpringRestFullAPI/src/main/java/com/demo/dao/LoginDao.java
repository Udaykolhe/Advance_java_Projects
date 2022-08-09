package com.demo.dao;

import com.demo.model.User;

public interface LoginDao {

	User gerUserDetails(String user, String pass);

}
