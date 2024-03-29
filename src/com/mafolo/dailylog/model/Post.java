package com.mafolo.dailylog.model;

import java.sql.Date;

public class Post {
	private String username;
	private Date  postdate;
	private String posttopic;
	private String postbody;

	public Post(String username, Date  postdate, String posttopic, String postbody) {
		this.username = username;
		this.postdate = postdate;
		this.posttopic = posttopic;
		this.postbody = postbody;
	}
	public Post(){

	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getPostdate() {
		return postdate;
	}
	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}
	public String getPosttopic() {
		return posttopic;
	}
	public void setPosttopic(String posttopic) {
		this.posttopic = posttopic;
	}
	public String getPostbody() {
		return postbody;
	}
	public void setPostbody(String postbody) {
		this.postbody = postbody;
	}
}
