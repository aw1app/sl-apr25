package com.sl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCReadDemo {

	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;
		
		String connectionURL = "jdbc:mysql://localhost:3306/estore";

		try {
			// 1. Create a Connection object
			conn = DriverManager.getConnection(connectionURL, "root", "rootroot");
			
			System.out.println("Connection established succesfully.");
			
			// 2. Create a Statement
			statement = conn.createStatement();
			
			//3. Execute SQL
			String sqlSelect = "SELECT * FROM products";
			ResultSet rs = statement.executeQuery(sqlSelect);
			
			System.out.printf("\n\n Products table data\n");
			System.out.printf(" ID NAME     PRICE CATEGORY \n");
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String name = rs.getString("name");
				float price = rs.getFloat("price");
				String category = rs.getString("category");
				
				System.out.printf(" %s  %s  %s  %s  \n",id,name,price,category );				
			}
			
		} catch (SQLException e) {
			System.out.println("Connection failed" + e);
			// e.printStackTrace();
		}

		
		
		// At the end close the DB connection
		try {
			conn.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}

}
