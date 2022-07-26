package com.noida;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class SelfReference {
 
    public static void main(String[] args) {
 
    	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        
        Person manager1 = new Person("Uday", "Pune");
        
        Person person1 = new Person("Vipul", "Bhopal");
        Person person2 = new Person("Rahul", "Indore");

        person1.setManager(manager1);
        person2.setManager(manager1);
        
        session.save(person1);
        session.save(person2);
        
        session.getTransaction().commit();
        session.close();
    }
}