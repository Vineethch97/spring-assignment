package com.customer.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Customer {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;

	@NotNull
	private String name;

	@NotNull
	private String ssn;
	
	@NotNull
	private long phone;
	
	@Email(regexp = ".+[@].+[\\.].+")
	private String email;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dob;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", ssn=" + ssn + ", phone=" + phone + ", email=" + email
				+ ", dob=" + dob + "]";
	}


}
