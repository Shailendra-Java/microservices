package com.example.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.User;

@Service
public class UserServiceImpl implements UserService {
	@Override
	public List<User> getAllUsers() {
		return this.users;
	}

	@Override
	public void createUser(Integer userId, String userName) {
		User user = new User(userId, userName);
		this.users.add(user);
	}
	// Dummy users
	public static List<User> users;

	public UserServiceImpl() {
		users = new LinkedList<>();
		users.add(new User(100, "David"));
		users.add(new User(101, "Peter"));
		users.add(new User(102, "John"));
	}

	@Override
	public void updateUser(Integer userId, String userName) {
		users.stream().filter(x -> x.getUserid() == userId)
		.findAny()
		.orElseThrow(() -> new RuntimeException("User not found"))
		.setUsername(userName);
		
	}

	@Override
	public void deleteUser(Integer userId) {
		users.removeIf((User u) -> u.getUserid() == userId);
		
	}

	@Override
	public User getUser(Integer userId) {
		// TODO Auto-generated method stub
		User user = null;
		for(User u : users)
			if(u.getUserid() == userId)
				user = u;
		return user;
	}

}
