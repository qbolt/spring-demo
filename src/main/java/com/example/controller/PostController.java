package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.entity.Post;
import com.example.service.PostService;

public class PostController {

	PostService postService;
	
	public PostController(PostService postService) {
		this.postService = postService;
	}
	
	@GetMapping("post")
	public List<Post> getPosts() {
		return postService.getPosts();
	}
	
	@PostMapping("post")
	public Post postPost(@RequestBody Post post) {
		return postService.postPost(post);
	}
	
}
