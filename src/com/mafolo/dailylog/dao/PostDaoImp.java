package com.mafolo.dailylog.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mafolo.dailylog.model.Post;

public class PostDaoImp implements PostDao {
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
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
	@Override
	public void inserPost(Post p) {
		//boolean userCreated = false;
		String sql = "insert into post(username,postdate, posttopic,postbody)" +
				"values('" + p.getUsername() + "','" +
				p.getPostdate() + "','" +		
				p.getPosttopic() + "','" +
				p.getPostbody() + "')";
		System.out.println(sql);
		Connection conn = null;
		try {
			conn = getConnection();
			Statement statement = conn.createStatement();
			statement.executeUpdate(sql);
			System.out.println(sql);
			//userCreated = true;
		}catch (SQLException e1) {
			e1.printStackTrace();
		}finally {
			closeConnection(conn);
		}
	}



	@Override
	public Post getPost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post searchPost(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
