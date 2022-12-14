package com.bikkadIt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATE_DETAILS")
public class STATES_MASTER {
	
	@Id
	@Column(name = "STATE_ID")
	private int stateId;
	
	@Column(name = "STATE_NAME")
	private String stateName;
	
	@Column(name = "COUNTRY_ID")
	private int countryId;
	
	
}