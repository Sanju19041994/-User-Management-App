package com.bikkadIt.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIt.entity.Country;
import com.bikkadIt.repositories.CountryRepository;
import com.bikkadIt.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Override
	public List<Country> getAllCountry() {
		List<Country> list = countryRepository.findAll();
		return list;
	}
}
