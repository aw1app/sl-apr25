package com.sl.forward;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/A")
public class A extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println(" INSIDE Servlet A doGet method START");

		PrintWriter out = response.getWriter();

		out.println("<h2> " + "Welcome to Servlet A ! " + "</h2>");

		System.out.println(" INSIDE Servlet A doGet method END");
		
		request.getRequestDispatcher("/B").forward(request, response);
		
		out.close();
		
	}

}
