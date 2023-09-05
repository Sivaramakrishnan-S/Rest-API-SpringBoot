package com.example.demo.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Doctor {
	@Column(name="USERNAME")
	private String username;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="FIRSTNAME")
	private String firstname;
	@Column(name="LASTNAME")
	private String lastname;
	@Column(name="EMAIL")
	private String email;
	@Id
	@Column(name="DOCTOR_ID")
	private int doctor_ID;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(String username, String password, String firstname, String lastname, String email, int doctor_ID) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.doctor_ID = doctor_ID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDoctor_ID() {
		return doctor_ID;
	}
	public void setDoctor_ID(int doctor_ID) {
		this.doctor_ID = doctor_ID;
	}
	
	
	
	
}
