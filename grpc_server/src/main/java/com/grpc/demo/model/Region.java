package com.grpc.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Regions")
public class Region {
	
	@Id
	@Column(name = "region_id")
	private Long idRegion;
	
	@Column(name = "name", nullable = false)
	private String name;

	public Region() {
		
	}
	
	public Long getIdRegion() {
		return idRegion;
	}

	public void setIdRegion(Long idRegion) {
		this.idRegion = idRegion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
