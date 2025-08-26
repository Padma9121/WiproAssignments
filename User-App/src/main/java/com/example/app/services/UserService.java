package com.example.app.services;

import java.util.List;

import com.example.app.entities.User;

public interface UserService {

	User save(User user);

	User getUserById(Long id);

	List<User> findAllUser();

	
}
