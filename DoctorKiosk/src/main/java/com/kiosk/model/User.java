package com.kiosk.model;

public class User {
	
	private String name;
	private String userName;
	private String password;
	private String email;
	private String address;
	public User(String name, String userName, String password, String email, String address) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", address=" + address + "]";
	}
	

}
