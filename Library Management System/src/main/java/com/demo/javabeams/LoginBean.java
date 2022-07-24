package com.demo.javabeams;

import java.io.Serializable;



public class LoginBean implements Serializable {
	private static final long serialVersionUID = 1L;
       
	   private String username;
	   private String password;
	   
	    public LoginBean(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

		

	    public LoginBean() {
			super();
		}



		public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }
	


}

