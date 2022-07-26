package com.keys.One;

import java.util.Date;
import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String city;
    
    
    
    @OneToOne (cascade = CascadeType.PERSIST)
    
    private Vehicle vehicle;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String city, Vehicle vehicle) {
		super();
		this.id = new Random().nextInt(100000);
		this.name = name;
		this.city = city;
		this.vehicle = vehicle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
    

	
    
    
}
