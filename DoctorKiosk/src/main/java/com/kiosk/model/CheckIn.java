package com.kiosk.model;

import java.util.Date;

public class CheckIn {
	
	private int checkInId ;
	private int patientId;
	private String patientName;
	private String email;
	private java.util.Date checkInTime;
	public CheckIn(int checkInId, int patientId, String patientName, String email, Date checkInTime) {
		super();
		this.checkInId = checkInId;
		this.patientId = patientId;
		this.patientName = patientName;
		this.email = email;
		this.checkInTime = checkInTime;
	}
	public int getCheckInId() {
		return checkInId;
	}
	public void setCheckInId(int checkInId) {
		this.checkInId = checkInId;
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
	public java.util.Date getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(java.util.Date checkInTime) {
		this.checkInTime = checkInTime;
	}
	@Override
	public String toString() {
		return "CheckIn [checkInId=" + checkInId + ", patientId=" + patientId + ", patientName=" + patientName
				+ ", email=" + email + ", checkInTime=" + checkInTime + "]";
	}
	

}
