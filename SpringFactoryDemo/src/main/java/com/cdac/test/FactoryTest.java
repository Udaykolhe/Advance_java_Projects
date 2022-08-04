package com.cdac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.Exam;
import com.demo.service.ExamBoard;



public class FactoryTest {

	public static void main(String[] args) {
	   ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"factorycfg.xml","properties.xml"} );
	       Exam ex = (Exam) context.getBean("xam");
	       System.out.println(ex);
	       
	       Exam exam= (Exam) context.getBean("exam");
	       System.out.println(exam);
	   
	   
	   

	}

}
