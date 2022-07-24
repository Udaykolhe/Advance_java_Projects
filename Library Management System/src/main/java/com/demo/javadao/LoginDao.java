package com.demo.javadao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 import com.demo.javabeams.LoginBean;

public class LoginDao {

	    public boolean validate(LoginBean loginBean) throws ClassNotFoundException {
	        boolean status = false;

	        try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				Connection conn = DriverManager
			            .getConnection("jdbc:mysql://localhost:3306/lms", "root", "Kazahks@5");

			            // Step 2:Create a statement using connection object
			            PreparedStatement ps = conn
			            .prepareStatement("SELECT * FROM login_details WHERE username = ? and password = ? "); 
				{
			            ps.setString(1, loginBean.getUsername());
			            ps.setString(2, loginBean.getPassword());

			            System.out.println(ps);
			            ResultSet rs = ps.executeQuery();
			            System.out.println("uday");
			            status = rs.next();
				}
			        
			     
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return status;
	        }

	}



