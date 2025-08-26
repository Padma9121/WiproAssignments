package com.example.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.entities.User;
import com.example.app.services.UserService;


import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	
	@PostMapping("/addNewUser")
	private User addUser(@RequestBody User user) {
		return userService.save(user);
		
	}
	@GetMapping("/getUserById/{id}")
	public User getUserById(@PathVariable Long id) {
		return userService.getUserById(id) ;
		
	}
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser(){
		return userService.findAllUser() ;
		
	}

}
