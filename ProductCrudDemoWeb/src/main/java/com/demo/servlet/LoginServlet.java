package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		UserService uservice= new UserServiceImpl(); 
		boolean status= uservice.getValidateUser(username,password);
		if(status) {
			out.println("<h3>Login Successfully</h3>");
		}
		else {
			out.println("Invalid Credentials");
			RequestDispatcher rd=request.getRequestDispatcher("LoginForm.html");
			rd.include(request, response);
		}
		
		
		
		
	}

}
