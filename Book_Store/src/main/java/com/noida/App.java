package com.noida;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.noida.beans.Address;
import com.noida.beans.Book;
import com.noida.beans.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        Book book= new Book();
        Customer cust = new Customer();
        Customer cust1 = new Customer();
        Address add = new Address();
        
        book.setBname("java");
        book.setAname("tata");
        book.setPrice(4000);
        
        cust.setCname("uday");
        cust.setPhone(122322);
        
        cust1.setCname("vipul");
        cust1.setPhone(122);
        
        
        
        Session session = factory.openSession();
		   session.beginTransaction();
		   
		   session.save(book);
		   session.save(cust);
		   session.save(cust1);
		   session.save(add); 
		   
		   session.getTransaction().commit();
		   
        
        
        
        
        
    }
}
