package com.spring.beans;

public class Employee {
  private int id;
  private String name;
  
  private Department dept;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(int id, String name, Department dept) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
}

public int getId() {
	return id;
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

public Department getDept() {
	return dept;
}

public void setDept(Department dept) {
	this.dept = dept;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
}
  
  
}
