package com.keys.many;

import java.util.List;
import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "depts")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int id;
	@Column(name = "dept_name",unique=true,nullable=false)
	private String dname;

	@OneToMany(cascade=CascadeType.ALL, mappedBy="dept")
	private List<Employee> emp;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int id,String dname, List<Employee> emp) {
		super();
		this.id = id;	
		this.dname = dname;
		this.emp = emp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

}
