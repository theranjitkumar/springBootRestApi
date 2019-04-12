package com.ranjit.controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	String username;

	// @GetMapping({"/"})
	// public String home() {
	// return "post";
	// }

	@GetMapping("/about")
	public ModelAndView about(ModelAndView mv, Principal principal) {

		try {

			username = principal.getName();
			System.out.println(username);

		} catch (NullPointerException e) {
			System.out.print("NullPointerException Caught");
		}
		if(username !=null){
			mv.addObject("username", username);
		}
		mv.setViewName("about");
		return mv;
	}

	@GetMapping("/contactus")
	public String contactus() {
		return "contactus";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/logout")
	public String logout() {
		return "login";
	}
}
