package com.mafolo.dailylog.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mafolo.dailylog.model.MyConnectionProvider;
import com.mafolo.dailylog.model.User;

public class UserDaoImp implements UserDao {
	
	static Connection conn;
	static PreparedStatement ps;

	@Override
	public int insertUser(User u){
		// insert into database
		String sql = "INSERT INTO USER VALUES (?,?)";
		int stat = 0;
		try {
			
			conn = MyConnectionProvider.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getName());
			ps.setString(3, u.getUserSurname());
			ps.setString(4, u.getUserPass());
			
			stat = ps.executeUpdate();
			conn.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return stat;
	}

	@Override
	public User getUser(String userName, String userPass) {
		// TODO Auto-generated method stub
		return null;
	}

}
