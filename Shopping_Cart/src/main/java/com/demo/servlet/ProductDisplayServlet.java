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

@WebServlet("/view")
public class ProductDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session= request.getSession();
		User user =(User) session.getAttribute("admin");
		System.out.println(user.getUname());
		if(user!=null) {
			ProductService pservice = new ProductServiceImpl();
			List<Product> plist=pservice.getAllProducts();
			List<Catagory> clist=pservice.getAllCatagory();
			out.println("<h1>All Product List : </h1>");
			out.println("<a href='addProduct.html'><button>Add Product</button></a>");
				out.println("<br><br>");
			out.println("<table border='2' width='50%' >"
					+ "<tr>"
					+ "<th>Product Id</th><th>Product Name</th><th>Quantity</th><th>Price</th>"
					+ "</tr>");
			for(Product p : plist) {
				   out.println("<tr align='center'>"
				   		+ "<td>"+p.getPid()+"</td><td>"+p.getPname()+"</td><td>"+p.getQty()+"</td><td>"+p.getPrice()+"</td>"
				   				+ "<td><a href='edit?pid="+p.getPid()+"'>Edit</a>"
				   				+ "<td><a href='del?pid="+p.getPid()+"'>Delete</a></td>"
				   		+ "</tr>");
			}
			
			// Catagory tables : -
				   		out.println("</table>");
				   		
				   		out.println("<a href='addCatagory.html'><button>Add Catagory</button></a>");
						out.println("<br><br>");
						out.println("<table border='2' width='50%' >"
								+ "<tr>"
								+ "<th>Catagory Id</th><th>Catagory Name</th>"
								+ "</tr>");
						for(Catagory c : clist) {
							   out.println("<tr align='center'>"
							   		+ "<td>"+c.getCatid()+"</td><td>"+c.getCname()+"</td>"
							   				+ "<td><a href='edit?pid="+c.getCatid()+"'>Edit</a>"
							   				+ "<td><a href='del?pid="+c.getCatid()+"'>Delete</a></td>"
							   		+ "</tr>");
						}
							   		out.println("</table>");
		}else {
			out.println("Invalid Credentials");
			RequestDispatcher rd=request.getRequestDispatcher("LoginForm.html");
			rd.include(request, response); 
		}
		
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request,response);
	}
}
