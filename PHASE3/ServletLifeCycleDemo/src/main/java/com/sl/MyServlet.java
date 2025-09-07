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
	// This method will be called just after the servlet object
	// is created upon first request from a http client
	// This method is called only once in the life time of the
	// this servlet
	public void init(ServletConfig config) {
		System.out.println("MyServlet INSIDE init() method ");
	}
	

	// Service method - called as many times
	// http clients hit this servlet
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("MyServlet INSIDE doGet method ");

		PrintWriter out = response.getWriter();

		out.println("<h2> " + "Welcome to MyServlet ! " + "</h2>");

		out.close();
	}
	
	//Life cycle destroy method
	// This method will be called when the servlet object
	// is garbage collected (due to shutting down of WS
	// or low system memory , etc)
	// All our clean up code related to this servlet
	// be put here.
	public void destroy() {
		System.out.println("MyServlet INSIDE destroy() method ");		
	}

}
