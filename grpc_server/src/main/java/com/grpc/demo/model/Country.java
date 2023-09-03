package com.grpc.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Countries")
public class Country {
	
	@Id
	@Column(name = "country_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCountry;
	
	@Column(name = "name", nullable = true)
	private String name;
	
	@Column(name = "area")
	private BigDecimal area;
	
	@Column(name = "national_day")
	private Date nationalDay;
	
	@Column(name = "country_code2", nullable = false)
	private String countryCodeMain;
	
	@Column(name = "country_code3")
	private String countryCodeAlternative;
	
	@ManyToOne
	@JoinColumn(name = "region_id", referencedColumnName = "region_id", nullable = false)
	private Region region;
	
	public Country() {
		super();
	}
	
	public Country(String name, BigDecimal area, Date nationalDay, String countryCodeMain, String countryCodeAlternative,
			Region region) {
		this.name = name;
		this.area = area;
		this.nationalDay = nationalDay;
		this.countryCodeMain = countryCodeMain;
		this.countryCodeAlternative = countryCodeAlternative;
		this.region = region;
	}

	public Long getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(Long idCountry) {
		this.idCountry = idCountry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getArea() {
		return area;
	}

	public void setArea(BigDecimal area) {
		this.area = area;
	}

	public Date getNationalDay() {
		return nationalDay;
	}

	public void setNationalDay(Date nationalDay) {
		this.nationalDay = nationalDay;
	}

	public String getCountryCodeMain() {
		return countryCodeMain;
	}

	public void setCountryCodeMain(String countryCodeMain) {
		this.countryCodeMain = countryCodeMain;
	}

	public String getCountryCodeAlternative() {
		return countryCodeAlternative;
	}

	public void setCountryCodeAlternative(String countryCodeAlternative) {
		this.countryCodeAlternative = countryCodeAlternative;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
	
}
