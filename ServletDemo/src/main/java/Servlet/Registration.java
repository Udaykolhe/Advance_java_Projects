package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DatabaseConfig.Db;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try
		{
		Db r= new Db();
		Connection con= r.getCon();
	    System.out.println("connection "+ con);
	    
	    String name  =  request.getParameter("name");
		String email =  request.getParameter("email");
		String phone =  request.getParameter("phone");
		String city  =  request.getParameter("city");
		
	    PreparedStatement ps=con.prepareStatement("INSERT INTO person_info(name,email,phone,city) VALUES(?,?,?,?)");
	   
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, phone);
		ps.setString(4, city);
		int m= ps.executeUpdate();
		
		
		if(m>0) {
			System.out.println("insertion Done");
		}else {
			System.out.println("Insertion Not Done");
		}
		
		con.getAutoCommit();
		
	}catch(Exception  r) {
		System.out.println("error ===="+r);
	}
		
		
	}

}
