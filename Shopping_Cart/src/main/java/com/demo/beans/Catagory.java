package com.demo.beans;

public class Catagory {
     private int catid;
     private String cname;
	public Catagory(int catid, String cname) {
		super();
		this.catid = catid;
		this.cname = cname;
	}
	
	
	public Catagory(String cname) {
		super();
		this.cname = cname;
	}


	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
     
}
