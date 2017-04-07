package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;


@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:3000")
public class UserController {
	
	UserService userService;
	
	@Autowired
	public UserController(UserService UserService) {
		this.userService = UserService;
	}
	
	@GetMapping("/user")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	@GetMapping("/user/{name}")
	public User getUser(@PathVariable(value="name") String name) {
		return userService.getUser(name);
	}
	
	@PostMapping("/user")
	public User postUser(@RequestBody User user) {
		return userService.postUser(user);
	}
	
}
