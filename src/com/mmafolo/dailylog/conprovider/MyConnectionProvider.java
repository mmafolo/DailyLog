package com.mmafolo.dailylog.conprovider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionProvider {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException ex) {
			
		}
	}
	private Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/diarylog","root","dineo");
	}
	private void closeConnection(Connection conn) {
		if(conn == null)
			return;
		try {
			conn.close();
		}catch(SQLException ex) {
			
		}
	}
}
