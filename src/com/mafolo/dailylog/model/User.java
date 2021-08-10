package com.mafolo.dailylog.model;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name, userName, userSurname, userPass,
			userEmail, userBio;

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
	public void setUserEmail(String email){
		this.userEmail = email;
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
	public String getUserEmail(){
		return userEmail;
	}
	public String getUserBio(){
		return userBio;
	}
	public List<User> addUsers(User user){
		List<User> list = new ArrayList<>(); 
		list.add(user);
		
		return list;
	}
	@Override
	public String toString() {
		return "User ["+"name=" + name + ", userName=" + userName + ", userSurname=" + userSurname
				+ "]";
	}
	
}
