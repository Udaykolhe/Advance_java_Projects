package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Qualifier
public class Student {
	@Value("101")
	private int sid;
	@Value("Uday")
	private String sname;

	@Autowired
	private Course course;

	public Student() {
		super();
		System.out.println("Default Constructor Student");
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, Course course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", course=" + course + "]";
	}

}
