package com.bikkadIt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.model.Login;
import com.bikkadIt.service.UserService;

@RestController
public class LoginController {

	@Autowired
	private UserService userService;
	
	
	@PostMapping("/loginCheck")
	public ResponseEntity<String> loginCheck(@RequestBody Login login){
		
		String loginCheck = userService.loginCheck(login);
		
		return new ResponseEntity<String>(loginCheck,HttpStatus.CREATED);
	}
}
