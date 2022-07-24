package com.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
//@WebServlet("/welcome1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private Double interest_rate;
      //use for the database url and username and pass 
      //only one but code write into the web.xml file
	public void init() {
		ServletConfig config= this.getServletConfig();
		interest_rate=Double.parseDouble(config.getInitParameter("intrest"));
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	public void destroy() {
		System.out.println("Destroy me by u");
	}

}
