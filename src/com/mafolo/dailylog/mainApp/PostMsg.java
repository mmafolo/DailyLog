package com.mafolo.dailylog.mainApp;

import java.util.Date;
//import java.sql.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mafolo.dailylog.dao.PostDao;
import com.mafolo.dailylog.dao.PostDaoImp;
import com.mafolo.dailylog.model.Post;
import com.mafolo.dailylog.model.User;

public class PostMsg extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PostDao postDao = new PostDaoImp();
	User user = new User();
	Post post = new Post();
	
	String postTopic, postBody;
	Date postDate = new Date();//java util.Date
	java.sql.Date sqlDate = new java.sql.Date(postDate.getTime());
	 
	protected void doPost(HttpServletRequest req, HttpServletResponse res) {
		
		postTopic = req.getParameter("msgtopc");
		postBody = req.getParameter("msgbody"); 
		System.out.println("In the post class");
		
		if(postTopic.isEmpty()) {
			System.out.println("Topic is required");
		}else {
			post.setPostbody(postBody);
			post.setPosttopic(postTopic);
			post.setUsername("mmafolo");
			post.setPostdate(sqlDate);
			postDao.inserPost(post);
			System.out.println("Inserting post");
		}
	}
}
