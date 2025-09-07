package com.sl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class NewProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection conn = null;
	Statement statement = null;

	public void init(ServletConfig config) {
		ServletContext context = config.getServletContext();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // optional
			String connectionURL = context.getInitParameter("ConnectionURL");

			// 1. Create a Connection object
			String adminID = context.getInitParameter("DBAdminName");
			String DBAdminPassword = context.getInitParameter("DBAdminPassword");
			conn = DriverManager.getConnection(connectionURL, adminID, DBAdminPassword);

			System.out.println("Connection established succesfully.");

		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Connection failed" + e);
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1> " + "Welcome to EStore ! " + "</h1>");

		try {
			// 2. Create a Statement
			statement = conn.createStatement();
			// 3. Execute SQL
			String sqlSelect = "INSERT INTO products";
			ResultSet rs = statement.executeQuery(sqlSelect);

			out.printf("<table border=1> Products table data");
			out.printf("<tr> <td>ID <td>NAME<td>   PRICE <td>   CATEGORY </tr>");
			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");
				float price = rs.getFloat("price");
				String category = rs.getString("category");

				out.printf("<tr> <td>%s  <td>%s  <td>%s  <td>%s", id, name, price, category);
			}
			out.printf("</table>");

		} catch (SQLException e) {
			System.out.println("Connection failed" + e);
			// e.printStackTrace();
		}

		out.close();
	}

	public void destroy() {
		// At the end close the DB connection
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
