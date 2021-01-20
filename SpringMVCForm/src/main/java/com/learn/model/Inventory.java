package com.learn.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;


@Entity
@Table(name="inventory_agent")
public class Inventory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private long id; 
	
	@Column(name = "first_name")
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=2,message="is required more chars")
	
	@Column(name = "last_name")
	private String lastName;
	
	@NotNull(message="is required")
	@Email(message="give valid email id")
	@Column(name = "email")
	private String email;
	
	@NotNull(message="is required")
	@Min(value=18,message="must be greater than 18yrs")
	@Max(value=40,message="must be lesser than 18yrs")
	@Column(name = "age")
	private Integer age; 
	
	public Inventory() {
		
	}

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

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", age=" + age + "]";
	}
	
}
