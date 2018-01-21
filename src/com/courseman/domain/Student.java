package com.courseman.domain;

import java.util.Date;

public class Student {
	private String id;
	private String name;
	private Date dob;
	private String address;
	private String email;

	public Student() {
		super();
	}

	public Student(String id, String name, Date dob, String address, String email) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
