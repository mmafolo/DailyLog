package com.mafolo.dailylog.model;

import java.util.ArrayList;
import java.util.List;

public class User {

	private Long userId;
	private String name, userName, userSurname, userPass;
	
	public void setUserId(Long i) {
		this.userId = i;
	}
	public void setName(String n) {
		this.name = n;
	}
	public void setUserName(String us) {
		this.userName = us;
	}
	public void setUserSurname(String us) {
		this.userSurname = us;
	}
	public void setuserPass(String up) {
		this.userPass = up;
	}
	public Long getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserSurname() {
		return userSurname;
	}
	public String getUserPass() {
		return userPass;
	}
	public List<User> addUsers(User user){
		List<User> list = new ArrayList<>(); 
		list.add(user);
		
		return list;
	}
}
