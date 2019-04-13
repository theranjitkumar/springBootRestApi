package com.ranjit.controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	String username;

	@GetMapping("/about")
	public ModelAndView about(ModelAndView mv, Principal principal) {

		try {

			username = principal.getName();
			System.out.println(username);

		} catch (NullPointerException e) {
			System.out.print("NullPointerException Caught");
		}
		if (username != null) {
			mv.addObject("username", username);
		} else {
			System.out.println("about "+username);
			mv.addObject("username", "Stranger");
		}
		mv.setViewName("about");
		return mv;
	}

	@GetMapping("/contactus")
	public ModelAndView contactus(ModelAndView mv, Principal principal) {
		try {

			username = principal.getName();
			System.out.println(username);

		} catch (NullPointerException e) {
			System.out.print("NullPointerException Caught");
		}
		if (username != null) {
			mv.addObject("username", username);
		} else {
			System.out.println("contactus "+username);
			mv.addObject("username", "Stranger");
		}
		mv.setViewName("contactus");
		return mv;
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/logout")
	public ModelAndView logout(ModelAndView mv, Principal principal) {
		System.out.println("lout done");
		try {

			username = principal.getName();
			System.out.println(username);

		} catch (NullPointerException e) {
			if (username != null) {
				mv.addObject("username", "Stranger");
			}
			System.out.print("NullPointerException Caught");
		}
		if (username != null) {
			mv.addObject("username", "Stranger");
		} else {
			System.out.println("logout "+username);
			mv.addObject("username", "Stranger");
		}
		mv.setViewName("/");
		return mv;
	}
}
