package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Product;
import com.demo.beans.User;
import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");

		UserService uservice= new UserServiceImpl(); 
		User user= uservice.validateUser(username,password);
		if(user!=null &&user.getRole().equals("admin")) {
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(50);
			if(session.isNew()) {
				System.out.println("new Session");
			}else {
				session.invalidate();
			    session = request.getSession(true);
			}
			session.setAttribute("admin", user);
			RequestDispatcher rd=request.getRequestDispatcher("view");
			rd.forward(request, response);
			
		}
		else if(user!=null && user.getRole().equals("user")) {
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(50);
			if(session.isNew()) {
				out.println("new Session");
			}else {
				session.invalidate();
			    session = request.getSession(true);
			}
			session.setAttribute("user", user);
			RequestDispatcher rd=request.getRequestDispatcher("catagory");
			rd.forward(request, response);
			
		}
		else {
			out.println("Invalid Credentials");
			RequestDispatcher rd=request.getRequestDispatcher("LoginForm.html");
			rd.include(request, response);
		}
		
		
		
		
	}

}
