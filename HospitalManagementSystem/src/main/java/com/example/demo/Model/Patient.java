package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="PatientDetails")
public class Patient {
	@Id@Column(name="PatientID")
	private int id;
	@Column(name="PatientName")
	private String name;
	@Column(name="Age")
	private int age;
	@Column(name="Gender")
	private String gender;
	@Column(name="SugarLevel")
	private String Sugar;
	@Column(name="BloodPressure")
	private String Bp;
	@Column(name="AppointmentNumber")
	private int an;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int id, String name, int age, String gender, String sugar, String bp, int an) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		Sugar = sugar;
		Bp = bp;
		this.an = an;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSugar() {
		return Sugar;
	}
	public void setSugar(String sugar) {
		Sugar = sugar;
	}
	public String getBp() {
		return Bp;
	}
	public void setBp(String bp) {
		Bp = bp;
	}
	public int getAn() {
		return an;
	}
	public void setAn(int an) {
		this.an = an;
	}
//	{
//        "id": 1,
//        "name": "jack",
//        "age": 45,
//        "gender": "Male",
//        "an": 1,
//        "sugar": "normal",
//        "bp": "normal"
//    }
	
}
