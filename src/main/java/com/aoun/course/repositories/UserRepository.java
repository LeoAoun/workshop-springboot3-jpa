package com.aoun.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aoun.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
