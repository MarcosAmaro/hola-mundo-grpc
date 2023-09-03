package com.grpc.demo.mapper;

import java.util.Date;

import com.grpc.demo.model.Country;
import com.grpc.demo.model.Region;
import com.grpc.demo.service.CountryServiceClass.CountryDTO;

public class CountryMapper {

	
	public CountryDTO toDTO(Country c) {
		CountryDTO dto = CountryDTO.newBuilder()
		.setIdCountry(c.getIdCountry())
		.setIdRegion(c.getRegion().getIdRegion())
		.setCountryName(c.getName())
		.setRegionName(c.getRegion().getName())
		.setNationalDay(c.getNationalDay() != null ? c.getNationalDay().getTime() : 0L)
		.setCountryCodeMain(c.getCountryCodeMain())
		.build();
		
		return dto;
	}
		
	public Country toModel(CountryDTO dto) {
		Country c = new Country();
		Region r = new Region();
		r.setIdRegion(dto.getIdRegion());
		c.setIdCountry(dto.getIdCountry());
		c.setRegion(r);
		c.setName(dto.getCountryName());
		//c.setNationalDay(new Date(dto.getNationalDay()));
		c.setCountryCodeMain(dto.getCountryCodeMain());
		return c;
	}
}
