package com.sl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/new-product")
public class NewProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		
		String[] categories = request.getParameterValues("category");
		
		out.println("<h1> Thank you for submitting new product! </h1>");
		String responseMesage = "YoUR PRODUCT name is  "+ name + " price is " + price 
				+ " and categories are " +Arrays.toString(categories);
		
		out.println("<h2> " + responseMesage +  "</h2>");
		out.close();		
	}

}
