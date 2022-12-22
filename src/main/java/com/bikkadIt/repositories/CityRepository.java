package com.bikkadIt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer>{

	List<City> findByStateId(int stateId);
}
