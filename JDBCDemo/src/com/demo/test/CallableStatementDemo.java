package com.demo.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementDemo {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/crud";
			String username="root";
			String password="Kazahks@5";
	        Connection conn=DriverManager.getConnection(url,username,password);
			if(conn!=null) {
				System.out.println("Connection Done!");
			}else {
				System.out.println("Connection Not Done");
			}
			
			CallableStatement cs= conn.prepareCall("{call getUserCity(?,?)}");
			Scanner sc=new Scanner(System.in);
			System.out.println("Count Person By (Enter) City name : ");
			String city=sc.next();
			cs.setString(1, city);
			cs.registerOutParameter(2,Types.INTEGER);
			cs.execute();
			int cnt=cs.getInt(2);
			System.out.println( cnt +" Person From : "+city+ "city");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
