package com.bikkadIt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.entity.States;

@Repository
public interface StatesRepository extends JpaRepository<States, Integer>{

	List<States> findByCountryId(int countryId);
}
