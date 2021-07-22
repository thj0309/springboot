package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	@EntityGraph(attributePaths = { "boards" })
	List<User> findAll();

    User findByUsername(String username);
}