package com.ranjit.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ranjit.entity.User;
import com.ranjit.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public void saveUser(User user) {
		userRepository.save(user);
	}

	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public Optional<User> getUser(Long id) {
		return userRepository.findById(id);
	}
	public User getUserBYId(Long id) {
		return userRepository.getOne(id);
	}

}
