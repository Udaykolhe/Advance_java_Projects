package com.spring.beans;

public class Employee {
	private int id;
	private String name;
	private Address addr;

	public Employee() {
		super();
		System.out.println("Default Constuctor");
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {
		System.out.println("Setter Id");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter name");
		this.name = name;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}

	

}
