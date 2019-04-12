package com.ranjit.restControllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ranjit.entity.Post;
import com.ranjit.service.PostService;

@RestController
@RequestMapping(value = "/api")
public class PostRestController {

	@Autowired
	private PostService postService;

	@RequestMapping(value = "/posts", method = RequestMethod.POST)
	public String addPosts(@RequestParam String userId, @RequestParam String title, @RequestParam String body) {

		Post post = new Post();
		post.setUserId(userId);
		post.setTitle(title);
		post.setBody(body);
		postService.savePost(post);
		return "Add Success";
	}
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public List<Post> getPosts() {
		List<Post> posts = new ArrayList<>();
		posts = postService.allPosts();
		return posts;
	}

}
