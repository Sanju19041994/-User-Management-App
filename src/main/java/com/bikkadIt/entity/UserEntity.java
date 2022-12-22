package com.bikkadIt.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "USER_ACCOUNTS")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "FIRST_NAME")
	private String fname;

	@Column(name = "lAST_NAME")
	private String lname;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PHNO")
	private String phone;

	@Column(name = "DOB")
	private Date dob;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "STATE")
	private String state;

	@Column(name = "CITY")
	private String city;

	@Column(name = "USER_PASSWORD")
	private String password;

	@Column(name = "ACC_STATUS")
	private String accStatus;

	@CreationTimestamp
	@Column(name = "CREATED_DATE",updatable = false)
	private LocalDate createdDate;

	@UpdateTimestamp
	@Column(name = "UPDATED_DATE", insertable = false)
	private LocalDate updatedDate;
	
}
