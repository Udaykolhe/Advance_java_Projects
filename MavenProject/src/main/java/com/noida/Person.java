package com.noida;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {

	@Id
	@GeneratedValue
	private int personId;
	private String firstname;
	private String city;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "manager_id")
	private Person manager;

	@OneToMany(mappedBy = "manager")
	private Set<Person> refself = new HashSet<Person>();

	public Person() {
	}

	public Person(String firstname, String city) {
		this.firstname = firstname;
		this.city = city;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int PersonId) {
		this.personId = PersonId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Person getManager() {
		return manager;
	}

	public void setManager(Person manager) {
		this.manager = manager;
	}

	public Set<Person> getRefself() {
		return refself;
	}

	public void setRefself(Set<Person> Refself) {
		this.refself = refself;
	}

}
