package com.mmafolo.dailylog.conprovider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionProvider {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	//Member should be private??
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/diarylog","root","mandla");
	}
	//Member should be private??
	public void closeConnection(Connection conn) {
		if(conn == null)
			return;
		try {
			conn.close();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
}
