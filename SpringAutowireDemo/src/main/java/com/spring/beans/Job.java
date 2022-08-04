package com.spring.beans;

public class Job {
     private int jid;
     private String jname;
     
     
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Job(int jid, String jname) {
		super();
		this.jid = jid;
		this.jname = jname;
	}
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	@Override
	public String toString() {
		return "Job [jid=" + jid + ", jname=" + jname + "]";
	}
     
     
}
