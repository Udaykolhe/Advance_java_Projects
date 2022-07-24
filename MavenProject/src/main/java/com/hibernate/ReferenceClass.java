package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReferenceClass {
      public static void main(String [] args) {
    	  SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
  		   Student std = new Student();
  		   std.setName("Uday");
  		   std.setCity("Nepa");
  		     		   
  		   Certificate certi= new Certificate();
  		   certi.setCourse("Hibernate");
  		   certi.setDuration("5 M");
  		   std.setCrti(certi);
  		   
  		   Session session = factory.openSession();
  		   session.beginTransaction();
  		   
  		   session.save(std);
  		   
  		   session.getTransaction().commit();
  		   
  		   System.out.println("Done....");
  		  
  		   
  		   
    	  
      }
}
