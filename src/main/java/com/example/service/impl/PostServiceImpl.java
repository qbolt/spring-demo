package com.example.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Post;
import com.example.repo.PostRepo;
import com.example.service.PostService;

@Service
public class PostServiceImpl implements PostService {

	PostRepo postRepo;

	public PostServiceImpl(PostRepo postRepo) {
		super();
		this.postRepo = postRepo;
	}
	
	public List<Post> getPosts() {
		return postRepo.findAll();
	}

	@Override
	public Post postPost(Post post) {
		return postRepo.saveAndFlush(post);
	}
}
