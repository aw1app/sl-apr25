package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//Life cycle init method
	public void init(ServletConfig config) {
		System.out.println("MyServlet INSIDE init() method ");
	}
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("MyServlet INSIDE doGet method ");

		PrintWriter out = response.getWriter();

		out.println("<h2> " + "Welcome to MyServlet ! " + "</h2>");

		out.close();
	}
	
	public void destroy() {
		System.out.println("MyServlet INSIDE destroy() method ");		
	}

}
