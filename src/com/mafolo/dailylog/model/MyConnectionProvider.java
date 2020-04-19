package com.mafolo.dailylog.model;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mafolo.dailylog.myinterface.MyProvider;

public class MyConnectionProvider implements MyProvider {
	
	static Connection conn = null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(connurl, dbname, dbpass);
		}catch(Exception e) {
			System.out.println(e);
		}
		return conn;
	}
}
