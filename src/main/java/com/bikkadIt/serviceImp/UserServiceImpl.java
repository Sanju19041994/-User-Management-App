package com.bikkadIt.serviceImp;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIt.entity.City;
import com.bikkadIt.entity.Country;
import com.bikkadIt.entity.States;
import com.bikkadIt.entity.UserEntity;
import com.bikkadIt.model.Login;
import com.bikkadIt.model.UnlockUser;
import com.bikkadIt.model.User;
import com.bikkadIt.repositories.CityRepository;
import com.bikkadIt.repositories.CountryRepository;
import com.bikkadIt.repositories.StatesRepository;
import com.bikkadIt.repositories.UserRepository;
import com.bikkadIt.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private StatesRepository statesRepository;
	
	@Autowired
	private CityRepository citiesRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<Country> getAllCountry() {
		List<Country> list = countryRepository.findAll();
		return list;
	}

	@Override
	public List<States> getAllStates(int countryId) {
		List<States> findByCountryId = statesRepository.findByCountryId(countryId);
		return findByCountryId;
	}

	@Override
	public List<City> getAllCity(int stateId) {
		List<City> findByStateId = citiesRepository.findByStateId(stateId);
		return findByStateId;
	}

	@Override
	public boolean saveUser(User user) {
		user.setAccStatus("LOCKED");
		user.setPassword(generateRandomPassword());
		
		UserEntity userEntity = new UserEntity();
		
		BeanUtils.copyProperties(user, userEntity);
		UserEntity entity = userRepository.save(userEntity);
		
		if(entity !=null) {
			return true;
		}else {
			return false;
		}
	}
	
	private String generateRandomPassword() {
		String randomPass = RandomStringUtils.randomAlphanumeric(4);
		return randomPass;
	}

	
	@Override
	public String loginCheck(Login login) {
		
		String email = login.getEmail();
		String password = login.getPassword();
		UserEntity userEntity = userRepository.findByEmailAndPassword(email, password);

		if (userEntity != null) 
		{
			if (userEntity.getAccStatus().equals("LOCKED")) 
			{
				return "You account is locked, You are not active user ";
			}else 
			{
				return "Login Successfully";
			}
		}else 
		{
			return "Invalid  creditionals, Login Fail";
		}
	}
	
	@Override
	public boolean unlockUserSetPass(UnlockUser unloackUser) {
		String email = unloackUser.getEmail();
		String tempPassword = unloackUser.getTempPassword();
		UserEntity user = userRepository.findByEmailAndPassword(email, tempPassword);

		if (user != null) {
			user.setAccStatus("UNLOCKED");
			user.setPassword(unloackUser.getNewPassword());
			userRepository.save(user);
			return true;
		} else 
		{
			return false;
		}
	}

	@Override
	public boolean forgotPassword(String email) {
		UserEntity findByEmail = userRepository.findByEmail(email);
		if(findByEmail != null)
		{
			return true;
		}else 
		{
		return false;
		}
	}
	
	
}
