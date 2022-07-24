package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareDStatement {

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
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name : ");
			String nm=sc.next();
			PreparedStatement ps= conn.prepareStatement
					       ("SELECT id,name,city FROM person_info WHERE name=?");
			ps.setString(1, nm);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("Id : "+rs.getInt(1));
				System.out.println("Name : "+rs.getString(2));
				System.out.println("City : " +rs.getString(3));
			}
			
			PreparedStatement ps1=conn.prepareStatement("UPDATE person_info SET city=? WHERE ID=?");
			System.out.println("Enter Id : ");
			int id=sc.nextInt();
			System.out.println("Enter update city");
			String city = sc.next();
			ps1.setString(1, city);
			ps1.setInt(2, id);
			int m=ps1.executeUpdate();
			if(m>0) {
				System.out.println("Update Done");
			}else {
				System.out.println("Update not Done");
			}
			
		} catch (SQLException e) {
			System.out.println("Error==>"+e);
			e.printStackTrace();
		}
	}

}
