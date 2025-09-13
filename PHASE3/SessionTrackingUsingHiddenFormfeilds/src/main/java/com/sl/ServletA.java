package com.sl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ServletA")
public class ServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Random random = new Random();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String sessionID = request.getParameter("sessionID");

		if (sessionID != null) {
			out.println("<h2> " + "Welcome to Servlet A !. Session ID was found. " + "</h2>");

		}

		else {

			out.println(
					"<h2> " + "Welcome to Servlet A ! Session ID was NOT found. Creating a new sessionID " + "</h2>");

			sessionID = "" + random.nextInt();

			out.println("<html><form action='ServletB' method='POST'>");
			out.println("<input type='hidden' name='sessionID' value='" + sessionID + "'>");
			out.println("<input type='submit' value='submit' >");
			out.println("</form>");
			out.println("<script>document.forms[0].submit();</script></html>");

		}

		out.close();

	}

}