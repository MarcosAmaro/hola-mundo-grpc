package com.grpc.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Continents")
public class Continent {

	@Id
	@Column(name = "continent_id")
	private Long idContinent;
	
	@Column(name = "name", nullable = false)
	private String name;

	public Continent() {
	}

	public Long getIdContinent() {
		return idContinent;
	}

	public void setIdContinent(Long idContinent) {
		this.idContinent = idContinent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
