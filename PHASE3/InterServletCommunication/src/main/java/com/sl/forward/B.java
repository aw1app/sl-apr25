package com.sl.forward;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/B")
public class B extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println(" INSIDE Servlet B doGet method START");

		PrintWriter out = response.getWriter();

		out.println("<h2> " + "Welcome to Servlet B ! " + "</h2>");

		System.out.println(" INSIDE Servlet B doGet method END");
		out.close();
		
	}

}
