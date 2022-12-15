package com.bikkadIt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.entity.City;
import com.bikkadIt.entity.Country;
import com.bikkadIt.entity.States;
import com.bikkadIt.service.CityService;
import com.bikkadIt.service.CountryService;
import com.bikkadIt.service.StatesService;

@RestController
public class UserController {

	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StatesService statesService;
	
	@Autowired
	private CityService cityService;
	
	@GetMapping(value = "/getAllCountry", produces = "application/json")
	public ResponseEntity<List<Country>> getAllCountry(){
		List<Country> allCountry = countryService.getAllCountry();
		return new ResponseEntity<List<Country>>(allCountry,HttpStatus.OK);
	}
	
	@GetMapping(value = "/getAllStates/{countryId}", produces = "application/json")
	public ResponseEntity<List<States>> getAllStates(@PathVariable Integer countryId){
		List<States> allStates = statesService.getAllStates(countryId);
		return new ResponseEntity<List<States>>(allStates,HttpStatus.OK);
	}
	
	@GetMapping(value = "/getAllCities/{stateId}", produces = "application/json")
	public ResponseEntity<List<City>> getAllCities(@PathVariable Integer stateId){
	List<City> allCity = cityService.getAllCity(stateId);
		return new ResponseEntity<List<City>>(allCity,HttpStatus.OK);
	}
	
}
