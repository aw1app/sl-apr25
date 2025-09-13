package com.sl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ServletB")
public class ServletB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Random random = new Random();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String sessionID = null;

		Cookie[] cookies = request.getCookies();

		for (Cookie c : cookies) {

			if (c.getName().equals("sessionID")) {
				sessionID = c.getValue();
			}
		}
		;

		if (sessionID != null) {

			out.println("<h2> " + "Welcome to Servlet B !. Session ID was found. " + "</h2>");
			out.println("<a href='ServletA'> Go to Servlet A </a>");
			out.println("<a href='ServletC'> Go to Servlet C </a>");
		} else {

			out.println(
					"<h2>Welcome to Servlet B ! Session ID was NOT found. Creating a new cookie with sessionID </h2>");
			sessionID = "" + random.nextInt();
			Cookie cookie = new Cookie("sessionID", sessionID);
			response.addCookie(cookie);

			out.println("<a href='ServletA'> Go to Servlet A </a>");
			out.println("<a href='ServletC'> Go to Servlet C </a>");
		}

		out.close();

	}

}