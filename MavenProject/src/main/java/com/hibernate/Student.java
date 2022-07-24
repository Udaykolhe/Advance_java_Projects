package com.hibernate;

import java.util.Date;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	@Column
    private String name;
	@Column
    private String city;
	
	
	@Temporal(TemporalType.DATE)
	private Date dob ;
	
	private Certificate crti;
	public Student(int id, String name, String city, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.dob= dob;
	}
	public Certificate getCrti() {
		return crti;
	}
	public void setCrti(Certificate crti) {
		this.crti = crti;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    
}
