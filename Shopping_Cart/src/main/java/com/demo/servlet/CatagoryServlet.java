package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Catagory;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

/**
 * Servlet implementation class CatagoryServlet
 */
@WebServlet("/catagory")
public class CatagoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		ProductService pservice= new ProductServiceImpl();
		List <Catagory> clist = pservice.getAllCatagory();
		out.println("<form action='disprod'>");
		out.println("<select name='cid'>");
	for(Catagory c : clist) {
		out.println("<option value='"+c.getCatid()+"'>"+c.getCname()+"</option>");
	}
		out.println("</select>");
		out.println("<button type='submit'>Show product</button>");
		out.println("</form>");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

}
