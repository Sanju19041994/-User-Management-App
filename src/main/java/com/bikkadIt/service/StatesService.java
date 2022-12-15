package com.bikkadIt.service;

import java.util.List;

import com.bikkadIt.entity.States;

public interface StatesService {

	List<States> getAllStates(Integer countryId);
}
