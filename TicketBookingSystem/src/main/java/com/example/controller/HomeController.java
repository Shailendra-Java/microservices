package com.example.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@RestController
@RequestMapping("ticket")
public class HomeController {

	@Autowired
	UserService userSevice;

	@RequestMapping("/")
	public String sayHello() {
		return "Welcome to ticket booking System";
	}

	@ResponseBody
	@RequestMapping("/users")
	public List<User> getAllUsers() {
		return userSevice.getAllUsers();
	}

	@ResponseBody
	@RequestMapping("/user/{id}")
	public User getUser(@PathVariable("id") Integer id) {
		User user = userSevice.getUser(id);		
		return user;
	}

	@ResponseBody
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Map<String, Object> createUser(@RequestParam(value = "userid") Integer userid,
			@RequestParam(value = "username") String username) {
		Map<String, Object> map = new LinkedHashMap<>();
		userSevice.createUser(userid, username);
		map.put("result", "added");

		return map;
	}

	@ResponseBody
	@PutMapping("/update")
	public String updateUser(@RequestParam(value = "userid") Integer userid,
			@RequestParam(value = "username") String username) {
		userSevice.updateUser(userid, username);
		return "Record Updated";
	}

	@ResponseBody
	@DeleteMapping("/delete")
	public Map<String, Object> deleteUser(@RequestParam(value = "userid") Integer userid) {
		userSevice.deleteUser(userid);
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("result", "Record deleted");
		return map;
	}

}
