package com.ranjit.restControllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ranjit.entity.Comment;
import com.ranjit.service.CommentService;

@RestController
@RequestMapping(value="/api/comments")
public class CommentRestController {

	@Autowired
	private CommentService commentService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public List<Comment> allComment(){
		
		List<Comment> comments = new ArrayList<>();
		comments = commentService.allComments();
		return comments;
	}
}
