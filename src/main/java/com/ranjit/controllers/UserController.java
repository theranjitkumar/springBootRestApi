package com.ranjit.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ranjit.entity.User;
import com.ranjit.repository.UserRepository;
import com.ranjit.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/users")
	public String addUser(ModelAndView mv, @RequestParam String email, @RequestParam String username,
			@RequestParam String password) {
		User user = new User();
		user.setEmail(email);
		user.setUsername(username);
		user.setPassword(password);
		userService.saveUser(user);

		mv.setViewName("users");
		return "redirect:/users";
	}

	@GetMapping("/users")
	public ModelAndView getUsers(ModelAndView mv) {

		List<User> users = new ArrayList<>();
		users = userService.getAllUsers();

		mv.addObject("users", users);
		mv.setViewName("users");
		return mv;
	}

//	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
//	public User getUserById(@PathVariable Long id) {
//		return userService.getUser(id);
//	}

}
