package com.ranjit.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ranjit.entity.Comment;
import com.ranjit.repository.CommentRepository;

@Service
public class CommentService {
	
	@Autowired
	private CommentRepository commentRepo;

	public List<Comment> allComments(){
		List<Comment> comments = new ArrayList<>();
		comments = commentRepo.findAll();
		return comments;
	}
}
