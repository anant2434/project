package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.User;
import com.app.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired 
	private IUserService userservice;
	
	@GetMapping
	public List<User> getAllUsers(){
		return userservice.getAllUsers();
	}
	
	@PostMapping
	public User addNewUser(@RequestBody User newUser) {
		return userservice.addNewUser(newUser);
	}

}
