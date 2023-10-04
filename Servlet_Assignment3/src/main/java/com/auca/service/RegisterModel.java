package com.auca.service;

public class RegisterModel {
	private String firstname;
	private String lastname;
	private String address;
	private String dob;
	private String gender;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	private String email;
	private String phone;
	private String mothername;
	private String fathername;
	private String department;
	private byte[] certificate;
	private byte[] picture;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public byte[] getCertificate() {
		return certificate;
	}
	public void setCertificate(byte[] certificate) {
		this.certificate = certificate;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

}
