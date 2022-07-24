package com.keys.many;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToMany {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Department dept = new Department();
		dept.setDname("Banbury");
		
	
//		Employee emp = new Employee();
//		emp.setEname("Hitesh");
//		emp.setCity("Nepa");
//		emp.setAddDate(new Date());
		
		
	
        
		
//		List<Employee> elist = new ArrayList<Employee>();
//		elist.add(emp);
		

//		dept.setEmp(elist);

		Session session = factory.openSession();
		session.beginTransaction();

		session.save(dept);
		
		

		session.getTransaction().commit();
		session.close();

	}

}