package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DatabaseConfig.Db;

/**
 * Servlet implementation class Search
 */
@WebServlet("/search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       PrintWriter out=response.getWriter();
	          try {
					
					  Db r= new Db(); Connection con= r.getCon(); System.out.println("connection "+
					  con); Statement s= r.getSts();
					 
			    String name  =  request.getParameter("name");
			PreparedStatement ps=con.prepareStatement("SELECT * FROM person_info"
			   		+ " WHERE name=?");
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("Id : " +rs.getInt(1));
				System.out.println("Name : " +rs.getString(2));
				System.out.println("Email Id: " +rs.getString(3));
				System.out.println("Phone : " +rs.getString(4));
				System.out.println("City : " +rs.getString(5));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}    
	       
	}

}
