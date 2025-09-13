package com.sl.redirect;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/P")
public class P extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println(" INSIDE Servlet P doGet method START");

		PrintWriter out = response.getWriter();

		out.println("<h2> " + "Welcome to Servlet P ! " + "</h2>"); // useless, no content from P will be displayed in browser

		System.out.println(" INSIDE Servlet P doGet method END");
		
		response.sendRedirect("Q");
		
		out.close();
		
	}

}
