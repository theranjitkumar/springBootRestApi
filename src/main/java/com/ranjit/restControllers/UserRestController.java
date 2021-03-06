package com.ranjit.restControllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ranjit.entity.User;
import com.ranjit.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api")
public class UserRestController {

	@Autowired
	private UserService userService;

	@PostMapping("/users")
	public String addUser(@RequestParam String email, @RequestParam String username, @RequestParam String password) {
		User user = new User();
		user.setEmail(email);
		user.setUsername(username);
		user.setPassword(password);
		userService.saveUser(user);
		return "user saved";
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
	public String updateUser(@PathVariable(value = "id") Long id, @RequestParam String email,
			@RequestParam String username, @RequestParam String password) {

		User user = userService.getUserBYId(id);

		user.setEmail(email);
		user.setUsername(username);
		user.setPassword(password);
		userService.saveUser(user);
		return "Updadte sucess";
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable(value = "id") Long id) {
		userService.deleteUser(id);
		return "Delete sucess";
	}

	@RequestMapping("/users")
	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		users = userService.getAllUsers();
		return users;
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public Optional<User> getUserById(@PathVariable(value = "id") Long id) {
		return userService.getUser(id);
	}

	// DATA SORTING USING COMPARATOR
	@RequestMapping("/users/sort")
	public List<User> getSortedUsers(@RequestParam(required = false) String sortBy) {
		List<User> users = new ArrayList<>();
		users = userService.getAllUsers();
		class SortBy implements Comparator<User>  {
			public SortBy(){
				System.out.println("hello");
			}
			@Override
			public int compare(User arg0, User arg1) {
				System.out.println("byeeee: ");
				return arg0.getUsername().compareTo(arg1.getUsername());
				// return arg0.getId().compareTo(arg1.getId());
				// return arg0.getEmail().compareTo(arg1.getEmail());
			}

		};
		Collections.sort(users, new SortBy());

		System.out.println("SortBy: " + sortBy);

		
		return users;
	}
}
