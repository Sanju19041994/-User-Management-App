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
@Table(name = "STATES_MASTER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class States {
	
	@Id
	@Column(name = "STATE_ID")
	private int stateId;
	
	@Column(name = "STATE_NAME")
	private String stateName;
	
	@Column(name = "COUNTRY_ID")
	private int countryId;
	
	
}