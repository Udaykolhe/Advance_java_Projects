package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Employee;

/**
 * Hello world!
 *
 */
public class TestApplicationBean 
{
    public static void main( String[] args )
    {
        System.out.println( "Process...." );
        ApplicationContext context = new ClassPathXmlApplicationContext("springcfg.xml");
        Employee emp=(Employee)context.getBean("em");
        System.out.println(emp);
        
    }
}
