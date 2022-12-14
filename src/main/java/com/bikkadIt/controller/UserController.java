package com.bikkadIt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.entity.City;
import com.bikkadIt.entity.Country;
import com.bikkadIt.entity.States;
import com.bikkadIt.model.User;
import com.bikkadIt.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * @author sanju
	 * @return
	 * api implemented for get all country
	 */
	@GetMapping(value = "/getAllCountry", produces = "application/json")
	public ResponseEntity<List<Country>> getAllCountry(){
		List<Country> allCountry = userService.getAllCountry();
		return new ResponseEntity<List<Country>>(allCountry,HttpStatus.OK);
	}
	
	/**
	 * @author sanju
	 * @param countryId
	 * @return
	 * api implemented for get all states by passing country id as a parameter
	 */
	@GetMapping(value = "/getAllStates/{countryId}", produces = "application/json")
	public ResponseEntity<List<States>> getAllStates(@PathVariable Integer countryId){
		List<States> allStates = userService.getAllStates(countryId);
		return new ResponseEntity<List<States>>(allStates,HttpStatus.OK);
	}
	
	@GetMapping(value = "/getAllCities/{stateId}", produces = "application/json")
	public ResponseEntity<List<City>> getAllCities(@PathVariable Integer stateId){
	List<City> allCity = userService.getAllCity(stateId);
		return new ResponseEntity<List<City>>(allCity,HttpStatus.OK);
	}
	
	@PostMapping(value = "/saveUser", consumes = "application/json")
	public ResponseEntity<String> saveUser(@RequestBody User user){
		boolean saveUser = userService.saveUser(user);
		if(saveUser) {
			String msg = "User Saved Successful";
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}else {
			String msg = "User Not Saved";
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}
	}
	

	
}
