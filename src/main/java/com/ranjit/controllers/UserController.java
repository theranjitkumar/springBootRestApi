package com.ranjit.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ranjit.entity.User;
import com.ranjit.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@PostMapping("/users")
	public String addUser (@RequestParam String name, @RequestParam String email, @RequestParam String password) {
		User n = new User();
		n.setName(name);
		n.setEmail(email);
		n.setEmail(password);
		userRepository.save(n);
		return "Saved";
	}


	@RequestMapping("/users")
	public List<User> getUsers() {

		return (List<User>) userRepository.findAll();
	}

}
