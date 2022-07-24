package com.noida.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	   @Id
	   @GeneratedValue
	   @Column(name="ISBN")
	   private int isbn;
	   @Column(name="BOOK_NAME")
	   private String bname;
	   @Column(name="AUTHOR_NAME")
	   private String aname;
	   @Column(name="PRICE")
	   private double price;
	   
	   @ManyToMany
	   private List<Customer> cust =new ArrayList<Customer>();

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bname, String aname, double price, List<Customer> cust) {
		super();
				this.bname = bname;
		this.aname = aname;
		this.price = price;
		this.cust = cust;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Customer> getCust() {
		return cust;
	}

	public void setCust(List<Customer> cust) {
		this.cust = cust;
	}
	   
	   

}
