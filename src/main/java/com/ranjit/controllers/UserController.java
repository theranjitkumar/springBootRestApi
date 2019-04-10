package com.ranjit.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ranjit.entity.User;
import com.ranjit.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepo;

	@PostMapping("/users")
	public ModelAndView addUser(ModelAndView mv, @RequestParam String email, @RequestParam String username, @RequestParam String password) {
		User u = new User();
		u.setEmail(email);
		u.setUsername(username);
		u.setPassword(password);
		userRepo.save(u);
		mv.setViewName("users");
		return mv;
	}

	@GetMapping("/users")
	public ModelAndView getUsers(ModelAndView mv) {

	// return (List<User>) userRepository.findAll();
		List<User> users = new ArrayList<>();
		users = (List<User>) userRepo.findAll();
		mv.addObject("users", users);

		mv.setViewName("users");
		return mv;
	}

}
