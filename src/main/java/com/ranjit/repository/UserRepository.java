package com.ranjit.repository;

import org.springframework.data.repository.CrudRepository;

import com.ranjit.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	

}