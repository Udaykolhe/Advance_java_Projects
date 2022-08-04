package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Employee;

public class SpringAutowireTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
	    Employee emp = context.getBean("emp", Employee.class);
	            System.out.println(emp);
	} 

}
