package com.noida.model;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String uname;
	private String Password;
	private String role;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User(String uname, String password, String role) {
		super();
		this.uname = uname;
		Password = password;
		this.role = role;
	}
	

}
