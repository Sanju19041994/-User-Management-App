package com.bikkadIt.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIt.entity.States;
import com.bikkadIt.repositories.StatesRepository;
import com.bikkadIt.service.StatesService;

@Service
public class StatesServiceImpl implements StatesService {

	@Autowired
	private StatesRepository statesRepository;

	@Override
	public List<States> getAllStates(Integer countryId) {
		States states = statesRepository.findById(countryId).get();
		return (List<States>) states;
	}
	
	
}
