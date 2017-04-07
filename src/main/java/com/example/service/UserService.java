package com.example.service;

import java.util.List;

import com.example.entity.User;

public interface UserService {

	User getUser(String name);
	
	User postUser(User user);

	List<User> getUsers();
	
}
