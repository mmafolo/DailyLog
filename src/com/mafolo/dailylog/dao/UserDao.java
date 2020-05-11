package com.mafolo.dailylog.dao;

import com.mafolo.dailylog.model.User;

public interface UserDao {
	public User getUser(String uname, String upass);
	public boolean insertUser(User u);
}
