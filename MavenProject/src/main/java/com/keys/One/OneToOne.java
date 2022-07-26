package com.keys.One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOne {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		User users = new User();
		Vehicle vehicle = new Vehicle();

		users.setName("Uday");
		users.setCity("Nepa");

		vehicle.setVname("BMW");
		
		users.setVehicle(vehicle);
		Session session = factory.openSession();
        session.beginTransaction();
		session.persist(users);
		
		session.getTransaction().commit();
		
		session.close();

	}

}
