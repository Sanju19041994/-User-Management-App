package com.bikkadIt.model;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private String fname;

	private String lname;

	private String email;

	private String phone;

	private Date dob;

	private String gender;

	private String country;

	private String state;

	private String city;

	private String password;

	private String accStatus;
}
