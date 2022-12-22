package com.bikkadIt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.model.UnlockUser;
import com.bikkadIt.service.UserService;

@RestController
public class UnlockUserAccountController {

	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/unlockUser")
	public ResponseEntity<String> unlockUser(@RequestBody UnlockUser unlockUser){
		
		boolean user = userService.unlockUserSetPass(unlockUser);
		if(user) {
			return new ResponseEntity<String>("Your account unlocked successfully",HttpStatus.OK);
		}else
		{
			return new ResponseEntity<String>("Your account not unlocked",HttpStatus.OK);
		}
	}
}
