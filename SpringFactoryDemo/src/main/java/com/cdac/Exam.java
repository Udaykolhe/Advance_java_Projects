package com.cdac;

public class Exam {
	private int code;
	private String subject;
	private String mode;

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(int code, String subject, String mode) {
		super();
		this.code = code;
		this.subject = subject;
		this.mode = mode;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "Exam [code=" + code + ", subject=" + subject + ", mode=" + mode + "]";
	}

}
