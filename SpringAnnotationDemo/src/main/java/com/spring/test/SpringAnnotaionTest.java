package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Student;

public class SpringAnnotaionTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotion.xml");
              Student std=  context.getBean("student",Student.class);
		System.out.println(std);
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
