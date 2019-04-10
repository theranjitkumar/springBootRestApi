package com.ranjit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}

	@GetMapping("/about")
	public String about() {
		return "about.jsp";
	}

	@GetMapping("/contactus")
	public String contactus() {
		return "contactus.jsp";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login.jsp";
	}
	@GetMapping("/logout")
	public String logout() {
		return "login.jsp";
	}
}
