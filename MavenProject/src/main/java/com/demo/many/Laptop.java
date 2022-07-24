package com.demo.many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="laptops")
public class Laptop {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Lpid;
    private String lname;
     
    @ManyToMany(cascade=CascadeType.ALL)
    private List<User> user;


	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Laptop(int lpid, String lname, List<User> user) {
		super();
		Lpid = lpid;
		this.lname = lname;
		this.user = user;
	}


	public int getLpid() {
		return Lpid;
	}


	public void setLpid(int lpid) {
		Lpid = lpid;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public List<User> getUser() {
		return user;
	}


	public void setUser(List<User> user) {
		this.user = user;
	}
    
    
}
