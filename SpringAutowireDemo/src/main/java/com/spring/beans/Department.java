package com.spring.beans;

public class Department {
     private int did;
     private String dname;
     
     private Job job;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int did, String dname, Job job) {
		super();
		this.did = did;
		this.dname = dname;
		this.job = job;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", job=" + job + "]";
	}
     
     
}
