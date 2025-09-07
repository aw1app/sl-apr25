package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet  extends HttpServlet{
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		
		
		// Extract data from the Query String
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		out.println("<h1> Welcome to Estore </h1>");
		
		
		String responseMesage = "You are "+ name + " and your age is " + age;
		
		
		out.println("<h2> " + responseMesage +  "</h2>");
		
		
		out.close();		
	}
	
	
	

}
