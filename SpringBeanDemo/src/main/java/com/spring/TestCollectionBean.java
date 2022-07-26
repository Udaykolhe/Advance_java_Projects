package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Student;

public class TestCollectionBean {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springcfg.xml");
		Student sts=(Student)context.getBean("std");
		System.out.println(sts);

	}

}
