package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Employee;

public class TestConstructionBean {

	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("springcfg.xml");
		Employee emp = (Employee)contex.getBean("emp1");
		System.out.println(emp);

	}

}
