package com.ranjit.controllers;

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

	@Autowired
	private PostService postService;

	@RequestMapping(value = { "/", "/post" }, method = RequestMethod.GET)
	public ModelAndView getPosts(ModelAndView mv) {

		List<Post> posts = new ArrayList<>();
		posts = postService.allPosts();

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
