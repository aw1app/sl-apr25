package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ServletA")
public class ServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		HttpSession session = request.getSession(false); //		
		

		if (session != null) {
			out.println("<h2> " + "Welcome to Servlet A !. Session ID was found. " + "</h2>");
			out.println("<a href='ServletB'> Go to Servlet B </a>");
		}
		else {
			
			out.println("<h2>Welcome to Servlet A ! Session ID was NOT found. Creating a new sessionID</h2>");
			session = request.getSession(true); // create a new session object
			
			Product product1 = new Product("Shirt", 2000);
			session.setAttribute("product", product1);
			
			out.println("<a href='ServletB'> Go to Servlet B </a>");
		}

		out.close();

	}

}