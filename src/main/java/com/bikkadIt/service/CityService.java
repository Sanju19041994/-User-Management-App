package com.bikkadIt.service;

import java.util.List;

import com.bikkadIt.entity.City;

public interface CityService {

	List<City> getAllCity(Integer stateId);
}
