package com.spring.beans;

import java.util.List;

public class Student {
      private int stdid;
      private String name;
      
      private List<String> sub;

	public Student() {
		super();
		
	}

	public Student(int stdid, String name, List<String> sub) {
		super();
		this.stdid = stdid;
		this.name = name;
		this.sub = sub;
	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSub() {
		return sub;
	}

	public void setSub(List<String> sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", name=" + name + ", sub=" + sub + "]";
	}
      
      
}
