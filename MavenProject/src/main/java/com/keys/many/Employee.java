package com.keys.many;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emps")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int id;
	@Column(name="emp_name")
	private String ename;
	private String city;
	private Date addDate;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Department dept;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id,String ename, String city, Date addDate, Department dept) {
		super();
		this.id = id;
		this.ename = ename;
		this.city = city;
		this.addDate = addDate;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	
	
	
	

}