package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class View {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Student std = (Student) session.get(Student.class, 1);

		System.out.println(std);
		
		Address add= (Address)session.load(Address.class, 1);
		System.out.println(add.getAddcity());

		session.close();

	}

}
