package com.bikkadIt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.service.UserService;

@RestController
public class ForgotPasswordController {

	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/forgotPassword/{email}")
	public ResponseEntity<String> forgotPassword(@PathVariable String email){
		boolean forgotPassword = userService.forgotPassword(email);
		
		if(forgotPassword) 
		{
			return new ResponseEntity<String>("Password sent on your registered mail successfully", HttpStatus.OK);
		}else 
		{
			return new ResponseEntity<String>("Invaild email, Please enter your registerd email", HttpStatus.OK);
		}
	}
}
