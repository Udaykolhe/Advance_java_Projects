package com.hql;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;




public class Hql {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
	    
		Session session = factory.openSession();
		System.out.println("----------------------");
		
	
//		String hql1="from Student where city='Nepa'";
//		here Student = Entity name
//		and city = attribute of student class;
		
//		String hql2="from Student where city=:x";
		
//		session.beginTransaction();
		
//	Query q1=session.createQuery("delete from Student where city=:c");
//		q1.setParameter("c","Nepa");
//     int  r =q1.executeUpdate();
//	  	
	    
		
		
		String hql="from Student";
		       Query q= session.createQuery(hql);
		       
		       
//		  q.setParameter("x", "Nepa");     
		       
		       List<Student> list = q.list();
		       for(Student s : list)
		       {
		    	   System.out.println(s.getName());
		    	   }
		       }

}
