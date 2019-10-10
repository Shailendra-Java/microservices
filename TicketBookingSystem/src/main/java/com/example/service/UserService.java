package com.example.service;

import java.util.List;

import com.example.model.User;

public interface UserService {
	List<User> getAllUsers();
	void createUser(Integer userId, String userName);
	void updateUser(Integer userId, String userName);
	void deleteUser(Integer userId);
	User getUser(Integer userId);
}
