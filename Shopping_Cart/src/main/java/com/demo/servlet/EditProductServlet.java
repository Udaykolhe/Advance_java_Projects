package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

/**
 * Servlet implementation class EditProductServlet
 */
@WebServlet("/edit")
public class EditProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int pid = Integer.parseInt(request.getParameter("pid"));
		 
		 ProductService pservice = new ProductServiceImpl();
		  Product p= pservice.editById(pid);
		 out.println("<h1 align='center'>Edit Form : </h1>");
		 out.println("<form action='updateProduct' method='post' align='center'>");
		 out.println("Pid : <input type='number' readonly value='"+p.getPid()+"' name='pid'><br><br>");
	     out.println("Product Name : <input type='text' value='"+p.getPname()+"' name='pname'><br><br>");  
	     out.println("Quantity :     <input type='number' value='"+p.getQty()+"' name='qty'><br><br>");   
	     out.println("Price :        <input type='number' value='"+p.getPrice()+"' name ='price'><br><br>");   
	     out.println("<button type='submit'>Update Product</button>");
	     out.println("<button type='view'>Back</button>");  
	     out.println("</form>");
	     
	      
		   
		   
		   
	}

}
