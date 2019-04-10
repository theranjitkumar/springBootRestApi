package com.ranjit.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ranjit.entity.User;
import com.ranjit.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserRestController {

	@Autowired
	UserRepository userRepository;

	@PostMapping("/users")
	public User addUser(@RequestParam String username) {
		User u = new User();
		u.setEmail("test@email.com");
		u.setUsername("test");
		u.setPassword("test");
		return userRepository.save(u);
	}


	@RequestMapping("/users")
	public List<User> getUsers() {

		return (List<User>) userRepository.findAll();
	}

}
