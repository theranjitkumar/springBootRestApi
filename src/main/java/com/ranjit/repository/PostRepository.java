package com.ranjit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ranjit.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
