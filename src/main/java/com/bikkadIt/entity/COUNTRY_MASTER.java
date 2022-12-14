package com.bikkadIt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY_DTLS")
public class COUNTRY_MASTER {

	@Id
	@Column(name = "COUNTRY_ID")
	private int countryId;

	@Column(name = "COUNTRY_NAME")
	private String countryName;
}
