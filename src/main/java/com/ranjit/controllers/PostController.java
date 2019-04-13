package com.ranjit.controllers;

import java.security.Principal;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ranjit.entity.Post;
import com.ranjit.service.PostService;

@Controller

public class PostController {

	String username;

	@Autowired
	private PostService postService;

	public PostController() {

	}

	@RequestMapping(value = { "/", "/post" }, method = RequestMethod.GET)
	public ModelAndView getPosts(ModelAndView mv, Principal principal) {

		try {
			username = principal.getName();
		} catch (NullPointerException e) {
			System.out.print("NullPointerException Caught");
		}

		List<Post> posts = new ArrayList<>();
		posts = postService.allPosts();

		if (username != null) {
			System.out.println("posts "+username);
			mv.addObject("username", username);
		} else {
			System.out.println("posts "+username);
			mv.addObject("username", "Stranger");
		}

		mv.addObject("posts", posts);
		mv.setViewName("post");
		System.out.println(posts);
		return mv;
	}

	@RequestMapping(value = "/post/{id}", method = RequestMethod.GET)
	public ModelAndView getPostById(ModelAndView mv, @PathVariable(value = "id") int id) {
		Post post = postService.postById(id);
		mv.addObject("post", post);
		mv.setViewName("postById");
		System.out.println(post);
		return mv;
	}

}
