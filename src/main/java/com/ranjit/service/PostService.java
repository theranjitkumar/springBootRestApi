package com.ranjit.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ranjit.entity.Post;
import com.ranjit.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepo;
	
	public void savePost(Post post) {
		postRepo.save(post);
	}
	
	public List<Post> allPosts() {
		return postRepo.findAll();
	}

}
