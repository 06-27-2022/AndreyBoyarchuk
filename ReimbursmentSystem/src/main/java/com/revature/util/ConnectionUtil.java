package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	public static  Connection getNewConnection() throws SQLException{
		try {
		Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return DriverManager.getConnection(
		System.getenv("db_url"),
		System.getenv("db_username"),
		System.getenv("db_password")
		);
}}
