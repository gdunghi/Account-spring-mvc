package com.account;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class DBUtils {
	private  Connection conn;

	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/account_db?user=root&password=admin");
			return conn;
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return null;
		}
	}
	
	public void testConnection() {
		try(Connection con = getConnection();){
			if (null != con){
				System.out.println("Connected");
			}else {
				System.out.println("None Connection");
			}
		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}
	
	
}
