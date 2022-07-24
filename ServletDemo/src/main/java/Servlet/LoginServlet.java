package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String email = request.getParameter("email");
		String pass=request.getParameter("pass");
		
		if(email.equals("uday@gmail.com")) {
			RequestDispatcher rd=request.getRequestDispatcher("dashboard.html");
			rd.forward(request, response);
		}else {
			out.print("Username and Password Wrong!");
			RequestDispatcher rd =request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		
		
		
		
	}

}
