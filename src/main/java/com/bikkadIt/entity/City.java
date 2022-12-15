package com.bikkadIt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CITIES_MASTER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City {
	
	@Id
	@Column(name = "CITY_ID")
	private int cityId;

	@Column(name = "CITY_NAME")
	private String cityName;
	
	@Column(name = "STATE_ID")
	private int stateId;
	
	
}
