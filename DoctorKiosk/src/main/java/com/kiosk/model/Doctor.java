package com.kiosk.model;

import java.util.Date;

public class Doctor {
	
	private int doctorId;
	private String doctorName;
	private java.util.Date bufferTime;
	private java.util.Date noShowTime;
	private String delayMessage;
	private String noShowMessage;
	public Doctor(int doctorId, String doctorName, Date bufferTime, Date noShowTime, String delayMessage,
			String noShowMessage) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.bufferTime = bufferTime;
		this.noShowTime = noShowTime;
		this.delayMessage = delayMessage;
		this.noShowMessage = noShowMessage;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public java.util.Date getBufferTime() {
		return bufferTime;
	}
	public void setBufferTime(java.util.Date bufferTime) {
		this.bufferTime = bufferTime;
	}
	public java.util.Date getNoShowTime() {
		return noShowTime;
	}
	public void setNoShowTime(java.util.Date noShowTime) {
		this.noShowTime = noShowTime;
	}
	public String getDelayMessage() {
		return delayMessage;
	}
	public void setDelayMessage(String delayMessage) {
		this.delayMessage = delayMessage;
	}
	public String getNoShowMessage() {
		return noShowMessage;
	}
	public void setNoShowMessage(String noShowMessage) {
		this.noShowMessage = noShowMessage;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", bufferTime=" + bufferTime
				+ ", noShowTime=" + noShowTime + ", delayMessage=" + delayMessage + ", noShowMessage=" + noShowMessage
				+ "]";
	}
	

}
