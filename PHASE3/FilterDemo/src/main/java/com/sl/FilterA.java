package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FilterA extends HttpFilter {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println(" INSIDE Filter A doFilter method START");
		PrintWriter out = response.getWriter();

		//boolean allow = true;
		
		String name = request.getParameter("name");

		if (name.equalsIgnoreCase("Prakash")) {
			chain.doFilter(request, response);
		} else {
			out.println(name + ", Sorry, You are not allowed to go to Servlet A");
			out.close();
		}

	}

}
