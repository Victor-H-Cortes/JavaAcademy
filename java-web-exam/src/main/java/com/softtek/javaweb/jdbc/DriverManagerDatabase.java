package com.softtek.javaweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManagerDatabase {
	
	private DriverManagerDatabase() {}

	static {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection () {
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?user=critic&password=critic&serverTimezone=UTC&useSSL=false");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
