package com.bikkadIt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{

	// for login
	public UserEntity findByEmailAndPassword(String email, String password);
	
	// for forgetPassword
	public UserEntity findByEmail(String email);
}
