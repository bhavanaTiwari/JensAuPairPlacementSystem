package edu.srh.aupair.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class utilities {

	public static void main(String[] args) {
		
		try {
			getConnectionString();
		} catch (SQLException e) {
						e.printStackTrace();
		}

	}
	static Connection conn = null; 
	
	public static Connection getConnectionString() throws SQLException 
	{
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AU_PAIR_MANAGEMENT?useSSL=false", "root",
			"password123");
				//
		return conn;
	}
	
	
}
