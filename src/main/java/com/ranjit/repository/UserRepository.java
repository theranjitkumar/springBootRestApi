package com.ranjit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ranjit.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);
	

}