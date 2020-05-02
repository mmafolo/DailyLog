package com.mafolo.dailylog.dao;

import com.mafolo.dailylog.model.Post;

public interface PostDao {
	public void inserPost(Post p);
	public Post getPost();// get all posts
	public Post searchPost(String keyword);
}
