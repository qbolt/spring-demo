package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repo.UserRepo;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	UserRepo userRepo;
	
	@Autowired
	public UserServiceImpl(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	@Override
	public User getUser(String name) {
		return userRepo.findByName(name);
	}

	@Override
	public User postUser(User user) {
		return userRepo.saveAndFlush(user);
	}

	@Override
	public List<User> getUsers() {
		return userRepo.findAll();
	}

}
