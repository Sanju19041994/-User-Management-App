package com.bikkadIt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CITY_DTLS")
public class CITIES_MASTER {
	
	@Id
	@Column(name = "CITY_ID")
	private int cityId;

	@Column(name = "CITY_NAME")
	private String cityName;
	
	@Column(name = "STATE_ID")
	private int stateId;
	
	
}
