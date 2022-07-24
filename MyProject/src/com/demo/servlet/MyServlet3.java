package com.demo.servlet;

import java.io.IOException;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet3
 */
@WebServlet("/db")
public class MyServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String cmnmsg;
	    public void init() {
	    	ServletContext context=this.getServletContext();
	    	cmnmsg=context.getInitParameter("cmnmsg");
	    	
	    	
	    }
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
