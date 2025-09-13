package com.sl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ServletB")
public class ServletB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Random random = new Random();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		HttpSession session = request.getSession(false); //		
		

		if (session != null) {
			out.println("<h2> " + "Welcome to Servlet B !. Session ID was found. " + "</h2>");
			
			if(session.getAttribute("product") != null) {
				Product prod = (Product) session.getAttribute("product");
				out.println("<h3>  You have the following product in the cart" + prod.getName() + "</h2>");	
			}
			out.println("<a href='ServletA'> Go to Servlet A </a>");
		}
		else {
			
			out.println("<h2>Welcome to Servlet A ! Session ID was NOT found. Creating a new sessionID</h2>");
			session = request.getSession(true); // create a new session object
			out.println("<a href='ServletC'> Go to Servlet C </a>");
		}

		out.close();

	}

}