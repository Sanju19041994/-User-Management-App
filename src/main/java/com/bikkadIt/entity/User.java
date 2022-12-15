package com.bikkadIt.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ACCOUNTS")
public class User {

	private int userId;
	
	private  String userFirstName;
	
	private String userLastName;
	
	private String userMail;
	
	private long userPhno;
	
	private Date userDob;
	
	private String gender;
	
	private Country country;
	
	private States states;
	
	private City city;
	
	private char activeSwitch;
	
	private Date createdDate;
	
	private Date updatedDate;
	
	private String userPassword;
	
	
}
