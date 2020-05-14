package io.firstapp.springbootstarter.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import io.firstapp.springbootstarter.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByUserName(String userName);

}
