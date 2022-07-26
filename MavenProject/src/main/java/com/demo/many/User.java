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
@Table(name = "userss")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String uname;
	private String city;

	@ManyToMany(cascade=CascadeType.ALL)
	private List<Laptop> lp;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String uname, String city, List<Laptop> lp) {
		super();
		this.id = id;
		this.uname = uname;
		this.city = city;
		this.lp = lp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Laptop> getLp() {
		return lp;
	}

	public void setLp(List<Laptop> lp) {
		this.lp = lp;
	}

}
