package com.sl.redirect;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Q")
public class Q extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println(" INSIDE Servlet Q doGet method START");

		PrintWriter out = response.getWriter();

		out.println("<h2> " + "Welcome to Servlet Q ! " + "</h2>");

		System.out.println(" INSIDE Servlet Q doGet method END");
		out.close();
		
	}

}
