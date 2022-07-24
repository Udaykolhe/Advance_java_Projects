package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.User;

public class UserDaoImpl implements UserDao {
	private static Connection conn;
	private static PreparedStatement pgetuser;
	static {
	 try {
			conn=DBUtil.getMyConnection();
			pgetuser=conn.prepareStatement("SELECT * FROM user_login WHERE uname=? and pass=?");
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	@Override
	public User getUser(String username, String password) {
		try {
			
			pgetuser.setString(1, username);
			pgetuser.setString(2, password);
			ResultSet rs = pgetuser.executeQuery();
			
			if(rs.next()){
				return new User(rs.getString(1),rs.getString(2),rs.getString(3)); 	
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
        
		return null;
		
	}

}
