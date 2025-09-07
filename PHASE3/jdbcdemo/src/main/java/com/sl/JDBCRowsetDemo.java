package com.sl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JDBCRowsetDemo {

	public static void main(String[] args) throws SQLException {

		// Create a JdbcRowSet instance
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

		// Set database connection info
		rowSet.setUrl("jdbc:mysql://localhost:3306/estore");
		rowSet.setUsername("root");
		rowSet.setPassword("rootroot");

		String sqlSelect = "SELECT * FROM products";
		rowSet.setCommand(sqlSelect);

		// Execute the query
		rowSet.execute();

		System.out.println("---------------");
		System.out.printf("\n\n Products table data\n");

		while (rowSet.next()) {

			int id = rowSet.getInt("id");
			String name = rowSet.getString("name");
			float price = rowSet.getFloat("price");
			String category = rowSet.getString("category");

			System.out.printf(" %-5s  %-20s  %-8s  %-10s  \n", id, name, price, category);
		}
		;

		// Go back to the first row
		System.out.println("---------------");
		System.out.printf("at first row \n");
		rowSet.first();
		int id = rowSet.getInt("id");
		String name = rowSet.getString("name");
		float price = rowSet.getFloat("price");
		String category = rowSet.getString("category");

		System.out.printf(" %-5s  %-20s  %-8s  %-10s  \n", id, name, price, category);

		// Go back to the fifth row
		System.out.println("---------------");
		System.out.printf("at fifth  row \n");
		rowSet.absolute(5);
		id = rowSet.getInt("id");
		name = rowSet.getString("name");
		price = rowSet.getFloat("price");
		category = rowSet.getString("category");

		System.out.printf(" %-5s  %-20s  %-8s  %-10s  \n", id, name, price, category);
		
		
		// update the 5th row price to 25000.0f
		rowSet.updateFloat("price",25000.0f);
		rowSet.updateRow();

	}

}
