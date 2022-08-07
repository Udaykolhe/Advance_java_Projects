package com.demo.model;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component

public class Student {
	private int id;
	private String firstname;
	private String lastname;
	private String phone;
	private String email;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id,String firstname, String lastname, String phone) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
	
		
	}
	public Student(String firstname, String lastname, String phone, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		
	}


	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	@Override
	public String toString() {

		return "{\n"
				+ "Student List :-----> \n"
				+ "Student Id : "+id+ ",\n"
				+ "		First Name : "+firstname+ ",\n"
				+ "			Last Name : " +lastname+",\n"
				+ "				Phone : "+phone+ ",\n"
				+ "					Email Id : "+email+ "\n"
			                             + " 					}\n";
		
	}
	

	
	
	

}
