package com.demo.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
   //more then 1 url use in this mathod
@WebServlet(urlPatterns={"/welcome","/come"},
            initParams= {
            		@WebInitParam(name="uname",value="admin"),
            		@WebInitParam(name="password" , value="admin")
            },loadOnStartup=1)
                      
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException {
		//its is mandetory to write this in this mathod
		super.init(config);
		//Not removing in Enumeration
//		it is use for retrive a data of uname and password
		Enumeration<String> nm =config.getInitParameterNames();
		while(nm.hasMoreElements()) {
			String names = nm.nextElement();
			System.out.println(names+"--->"+config.getInitParameter(names));
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
