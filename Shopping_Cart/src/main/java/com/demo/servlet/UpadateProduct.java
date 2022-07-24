package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

@WebServlet("/updateProduct")
public class UpadateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int pid = Integer.parseInt(request.getParameter("pid"));
		String pname= request.getParameter("pname");
		int qty = Integer.parseInt(request.getParameter("qty"));
		float price = Float.parseFloat(request.getParameter("price"));
		
		//call to Product Call para constructor
		Product product = new Product(pid,pname,qty,price);
		ProductService pservice=new ProductServiceImpl();
		pservice.updateProduct(product);
		
		RequestDispatcher rs= request.getRequestDispatcher("view");
		rs.forward(request, response);
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	         doPost(request,response);
	}
	}


