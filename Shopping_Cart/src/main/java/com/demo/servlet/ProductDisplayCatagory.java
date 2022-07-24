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

import com.demo.beans.Catagory;
import com.demo.beans.Product;
import com.demo.beans.User;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

/**
 * Servlet implementation class ProductDisplayCatagory
 */
@WebServlet("/disprod")
public class ProductDisplayCatagory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		
		//Session
		HttpSession session=request.getSession();
		User user = (User) session.getAttribute("user");
		if(user!=null) {
			int cid=Integer.parseInt(request.getParameter("cid"));
			ProductService pservice= new ProductServiceImpl();
			out.println("Welcome : " +user.getUname());
			List<Product> plist = pservice.getProductByCatagory(cid);
			out.println("<form action='addcart'>");
			
			for(Product p : plist) {
				out.println("<input type='checkbox' id='p1' name='prod' value='"+p.getPid()+"'><lable for='p1'>"+p.getPname()+"==>"+p.getPrice()+"</label><br>");
			}
			out.println("<button type='submit'>All to cart</button>");
			out.println("</form>");
		}else {
			out.println("Invalid Credentials");
			RequestDispatcher rd=request.getRequestDispatcher("LoginForm.html");
			rd.include(request, response); 
		}
		
		
		
		
	}

}
