package com.bikkadIt.service;

import java.util.List;

import com.bikkadIt.entity.City;
import com.bikkadIt.entity.Country;
import com.bikkadIt.entity.States;
import com.bikkadIt.model.Login;
import com.bikkadIt.model.UnlockUser;
import com.bikkadIt.model.User;

public interface UserService {

	List<Country> getAllCountry ();
	
	List<States> getAllStates(int countryId);
	
	List<City> getAllCity(int stateId);
	
	boolean saveUser(User user);
	
	String loginCheck(Login login);
	
	boolean unlockUserSetPass(UnlockUser unlockUser);
	
	boolean forgotPassword(String email);
}
