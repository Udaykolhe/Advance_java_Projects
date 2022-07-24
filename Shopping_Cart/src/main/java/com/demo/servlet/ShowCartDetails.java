package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Catagory;
import com.demo.beans.Product;

@WebServlet("/showcart")
public class ShowCartDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		 HttpSession session = request.getSession();
		 @SuppressWarnings("unchecked")
		List<Product> cart = (List<Product>) session.getAttribute("cart");
		 
		 
		 out.println("<table border='2' width='50%' >"
					+ "<tr>"
					+ "<th>Product Id</th><th>Product Name</th><th>Quantity</th><th>Price</th>"
					+ "</tr>");
			for(Product p : cart) {
				   out.println("<tr align='center'>"
				   		+ "<td>"+p.getPid()+"</td><td>"+p.getPname()+"</td><td>"+p.getQty()+"</td><td>"+p.getPrice()+"</td>"
				   				  		+ "</tr>");
			}
				   		out.println("</table>");
				   		out.println("<a href='catagory'>All More Product</a><br>");
				   		out.println("<a href='paybill'>Pay Bill</a><br>");
				   		out.println("<a href='catagory'>Back</a>");
			
	}

}
