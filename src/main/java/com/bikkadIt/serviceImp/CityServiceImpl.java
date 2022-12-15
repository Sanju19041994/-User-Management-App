package com.bikkadIt.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIt.entity.City;
import com.bikkadIt.repositories.CityRepository;
import com.bikkadIt.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository citiesRepository;

	@Override
	public List<City> getAllCity(Integer stateId) {
		City city = citiesRepository.findById(stateId).get();
		return (List<City>) city;
	}

	
}
