package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcConnection {

	public static void main(String[] args) {
		//Step 1 Register Driver
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/crud";
			String username="root";
			String password="Kazahks@5";
	        Connection conn=DriverManager.getConnection(url,username,password);
	        if(conn!=null) {
	        	System.out.println("Connection Done!");
	        }else {
	        	System.out.println("Connection Error!");
	        }
	        
	        Statement st=conn.createStatement();
	        String sql="SELECT * FROM person_info";
	        ResultSet rs = st.executeQuery(sql);
	        while(rs.next()) {
	        	System.out.println("Name : "+rs.getString(1));
	        	System.out.println("Email : "+rs.getString(2));
	        	System.out.println("Phone : "+rs.getString(3));
	        	System.out.println("City : "+rs.getString(4));
	        }
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Name : ");
	        String nm=sc.next();
	        System.out.println("Enter Email : ");
	        String email = sc.next();
	        System.out.println("Enter Phone : ");
	        String phone = sc.next();
	        System.out.println("Enter City : ");
	        String city = sc.next();
	        sql = "INSERT INTO person_info (name,email,phone,city) VALUES "
	        		+ "('"+nm+"','"+email+"','"+phone+"','"+city+"')";
	        int n=st.executeUpdate(sql);
	        if(n>0) {
	        	System.out.println("Insertion Done");
	          }else {
	        	System.out.println("Insertion Not Done");
	        }
	        
	       } catch (SQLException e) {
			
			e.printStackTrace();
		}
		
        
	}

}
