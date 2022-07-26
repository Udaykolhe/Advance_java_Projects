package com.demo.many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManytoMany {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		User user = new User();
		user.setUname("Uday");
		user.setCity("Indore");

		User user1 = new User();
		user1.setUname("Vipul");
		user1.setCity("Bhopal");

		Laptop lp = new Laptop();
		lp.setLname("Lanovo");

		Laptop lp1 = new Laptop();
		lp1.setLname("HP");

		List<User> ulist = new ArrayList<User>();
		ulist.add(user);
		ulist.add(user1);

		List<Laptop> llist = new ArrayList<Laptop>();
           llist.add(lp);
           llist.add(lp1);
           
           user.setLp(llist);
           lp1.setUser(ulist);
           
          Session session=factory.openSession();
          session.beginTransaction();
           
          session.save(user);
          session.save(user1);
          session.save(lp);
          session.save(lp1);
          
          
           
           session.getTransaction().commit();
           session.close();
	}

}
