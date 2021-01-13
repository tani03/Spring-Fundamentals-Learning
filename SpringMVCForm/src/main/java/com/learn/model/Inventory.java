package com.learn.model;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class Inventory {
private String firstName;
	
	@NotNull(message="is required")
	@Size(min=2,message="is required more chars")
	private String lastName;
	
	@NotNull(message="is required")
	@Email(message="give valid email id")
	private String email;
	
	@NotNull(message="is required")
	@Min(value=18,message="must be greater than 18yrs")
	@Max(value=40,message="must be lesser than 18yrs")
	private Integer age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
