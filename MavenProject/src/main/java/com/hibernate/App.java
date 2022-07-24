package com.hibernate;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		// Creating Student objects
		Student st = new Student();
		// setter all inserted value
		st.setName("rahul");
		st.setCity("Pune");
		st.setDob(new Date());
		
		// Another calss object
		Address add= new Address();
//		add.setAddid(0);
		add.setAddcity("Bhopal");
		add.setAddeddate(new Date());
//		
//		FileInputStream fis= new FileInputStream("src/main/java/Uday_Kolhe.jpg");
//		byte[] data = new byte[fis.available()];
//		fis.read(data);
//		add.setImage(data);
		
;
		
//		// retrive Session
		Session session = factory.openSession();
		session.beginTransaction();

		// save the data
		session.save(st);
		session.save(add);
		// commit the permanted save data;
		session.getTransaction().commit();

		// close session is neccessery
		session.close();
		System.out.println("Done....");
	}
}
