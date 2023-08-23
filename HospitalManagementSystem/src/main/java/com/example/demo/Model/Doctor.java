package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="DoctorDetails")
public class Doctor {
	@Id@GeneratedValue
	private int docID;
	
	private String docName;
	
	private String splAt;
	
	private int AppointmentNo;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int docID, String docName, String splAt, int appointmentNo) {
		super();
		this.docID = docID;
		this.docName = docName;
		this.splAt = splAt;
		AppointmentNo = appointmentNo;
	}

	public int getDocID() {
		return docID;
	}

	public void setDocID(int docID) {
		this.docID = docID;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getSplAt() {
		return splAt;
	}

	public void setSplAt(String splAt) {
		this.splAt = splAt;
	}

	public int getAppointmentNo() {
		return AppointmentNo;
	}

	public void setAppointmentNo(int appointmentNo) {
		AppointmentNo = appointmentNo;
	}
	
	
}
