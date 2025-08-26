package com.example.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.entities.User;
import com.example.app.repository.UserRepository;


@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public User getUserById(Long id) {
		
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> findAllUser() {
		
		return userRepository.findAll() ;
	}
	
	


	

}
