package com.example.service;

import java.util.List;

import com.example.entity.Post;

public interface PostService {

	List<Post> getPosts();

	Post postPost(Post post);
	
}
