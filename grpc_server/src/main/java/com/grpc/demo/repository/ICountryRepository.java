package com.grpc.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grpc.demo.model.Country;

@Repository
public interface ICountryRepository extends JpaRepository<Country, Long>{
	
	public List<Country> findAllByNationalDayNullOrCountryCodeMainNull();

}
