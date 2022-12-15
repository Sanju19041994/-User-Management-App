package com.bikkadIt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{

}
