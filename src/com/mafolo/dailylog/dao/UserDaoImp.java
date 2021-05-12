package com.mafolo.dailylog.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mafolo.dailylog.model.User;

public class UserDaoImp implements UserDao {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	private Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/diarylog","root","mandla");
	}
	private void closeConnection(Connection conn) {
		if(conn == null)
			return;
		try {
			conn.close();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	@Override
	public User getUser(String uname, String upass) {
		System.out.println(uname + " In the imp file");
		// check if user is in the DB
		String sql = "select * from user where username = '" + uname +"'";
		System.out.println(sql);
		
		User user = new User();
		Connection conn = null;
		try {
			
			conn = getConnection();
			System.out.println(conn.toString());
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				user.setUserName(result.getString("username"));
				user.setuserPass(result.getString("userpass"));
							
					if((user.getUserName().equals(uname)) && user.getUserPass().equals(upass) ){				
						//user.setUserName(result.getString("username"));
						//user.setuserPass(result.getString("userpass"));
						user.setName(result.getString("name"));
						user.setUserSurname(result.getString("surname"));
						System.out.println("Username: "+ user.getUserName());
					}
					
				}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			closeConnection(conn);
		}
		return user;
	}
	public boolean insertUser(User u) {
		boolean userCreated = false;
	String sql = "insert into user(username,nameuser,usersurname,userpass)" +
		"values('" + 
			 u.getUserName() + "','" +
			 u.getName() + "','" +		
			 u.getUserSurname() + "','" +
			 u.getUserPass() + "')";
	System.out.println(sql + "Created statement before connecting to DB");
	Connection conn = null;
	try {
		conn = getConnection();
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);
		System.out.println(sql + "After insertion");
		userCreated = true;
	}catch (SQLException e1) {
		
		e1.printStackTrace();
	}finally {
		closeConnection(conn);
	}
		return userCreated;
	}

}
