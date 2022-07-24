package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/addcart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String[] parr=request.getParameterValues("prod");
		
		ProductService pservice=new ProductServiceImpl();
		List<Product> plist = pservice.getAllSelected(parr);
		//session
				HttpSession session= request.getSession();
		List<Product> cart = (List<Product>) session.getAttribute("cart");
		//generate cart only if are commint first time
		
		if(cart==null) {
			
			cart=new ArrayList<>();
		}
		
		//add all selected product into cart
		for(Product p : plist) {
			out.print(true);
			cart.add(p);
		}
		//override old to new
		session.setAttribute("cart",cart);
		
		RequestDispatcher rd =  request.getRequestDispatcher("showcart");
		rd.forward(request, response);
	}

}
