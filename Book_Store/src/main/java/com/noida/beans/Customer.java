package com.noida.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name="CUST_ID")
     private int cid;
	@Column(name="CUST_NAME")
	private String cname;
	
	@Column(name="MOBILE_NO")
	private long phone;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private Address cust;
	
	@ManyToMany
	private List<Book> book = new ArrayList<Book>();

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String cname, long phone) {
		super();
		this.cname = cname;
		this.phone = phone;
		this.cust = cust;
		this.book = book;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Address getCust() {
		return cust;
	}

	public void setCust(Address cust) {
		this.cust = cust;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
	
}
