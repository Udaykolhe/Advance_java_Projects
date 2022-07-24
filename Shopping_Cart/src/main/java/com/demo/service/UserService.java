package com.demo.service;

import com.demo.beans.User;

public interface UserService {

	User validateUser(String username, String password);

}
