package com.kiosk.model;

import java.util.Date;

public class Patient {
	private int patientId;
	private String patientName;
	private String email;
	private java.util.Date dateOfBirth;
	public Patient(int patientId, String patientName, String email, Date dateOfBirth) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public java.util.Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(java.util.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", email=" + email
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	

}
