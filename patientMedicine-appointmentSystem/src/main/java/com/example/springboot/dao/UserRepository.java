package com.example.springboot.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String s);

}
