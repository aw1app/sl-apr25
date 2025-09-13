package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ServletA")
public class ServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println(" INSIDE Servlet A doGet method START");

		PrintWriter out = response.getWriter();

		out.println("<h2> " + "Welcome to Servlet A ! " + "</h2>"); // useless, no content from A will be displayed in browser

		
		
		out.close();
		
	}

}