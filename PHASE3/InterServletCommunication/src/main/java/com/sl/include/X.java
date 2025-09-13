package com.sl.include;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/X")
public class X extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println(" INSIDE Servlet X doGet method START");

		PrintWriter out = response.getWriter();

		out.println("<h2> " + "Welcome to Servlet X ! " + "</h2>");

		System.out.println(" INSIDE Servlet X doGet method END");
		
		request.getRequestDispatcher("/Y").include(request, response);
		
		out.println("<h2> " + "Thank you for visiting X ! " + "</h2>");
		
		out.close();
		
	}

}
