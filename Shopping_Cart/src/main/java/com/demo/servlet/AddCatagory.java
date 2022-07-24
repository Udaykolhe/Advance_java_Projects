package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Catagory;
import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

/**
 * Servlet implementation class AddCatagory
 */
@WebServlet("/addcatagory")
public class AddCatagory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String cname= request.getParameter("cname");
				
		//call to Product Call para constructor
		Catagory cat = new Catagory(cname);
		ProductService pservice=new ProductServiceImpl();
		pservice.addCatagory(cat);
		
		RequestDispatcher rs= request.getRequestDispatcher("view");
		rs.forward(request, response);
	}

}
