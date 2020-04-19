package com.mafolo.dailylog.DAO;

import java.sql.SQLException;

import com.mafolo.dailylog.model.User;

public interface UserDao {
	
	public int insertUser(User u);
	public User getUser(String userName,String userPass);
}
