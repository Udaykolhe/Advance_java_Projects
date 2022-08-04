package com.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	@Value("201")
	private int cid;
	@Value("Java")
	private String cname;

	public Course() {
		super();
		System.out.println("Defalut cont Course");
		// TODO Auto-generated constructor stub
	}

	public Course(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		System.out.println("Setter cid");
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}

}
