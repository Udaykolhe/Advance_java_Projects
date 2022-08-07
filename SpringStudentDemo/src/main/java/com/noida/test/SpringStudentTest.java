package com.noida.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.noida.model.Student;
import com.noida.service.StudentService;

public class SpringStudentTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springcfg.xml");
		StudentService studentService = (StudentService) ctx.getBean("studentServiceImpl");
		int choise=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Add Student"
						       + "\n2.Delete Student"
					       	   + "\n3.Search Student By Id"
						       + "\n4.Search Student By Name"
	    	  		           + "\n5.Display All"
	    	  		           + "\n6.Sort By Student Name"
	    	  		           + "\n7.Modify Mobile-Number"
	    	  		           + "\n8.Exit");
	    System.out.println("Enter Choise : ");
		choise=sc.nextInt();
		switch(choise) {
		case 1:
			//Create Student
			int n = studentService.addStudent();
			if(n>0) {
				System.out.println("Insertion Done");
			}else {
				System.out.println("Insertion not Done");
			}
			break;
		case 2 :
			System.out.println("Enter Id : ");
			int id=sc.nextInt();
			boolean b=studentService.deleteById(id);
			if(b) {
				System.out.println("Deletion Done : ");
			}else {
				System.out.println("Deletion not Done");
			}
			break;
		case 3 :
			System.out.println("Enter the Id : ");
			id = sc.nextInt();
			try {
			Student p=studentService.getById(id);
			
			if(p!=null){
				System.out.println(p);
			}
			}catch (EmptyResultDataAccessException e){
				System.out.println("Wrong Id enter valid id !");
			}
			break;
		case 4:
			System.out.println("Enter Name : ");
			String nm=sc.next();
			List<Student>  slist=studentService.searchByName(nm);
			if(slist!=null) {
			  slist.forEach(System.out::println);
			}
			
			break;
		case 5:
			slist=studentService.displayAll();
			if(slist!=null) {
				slist.forEach(System.out::println);
			}else {
				System.out.println("Not Found");
			}
			break;
		case 6:
			
			break;
		
		case 7:
			System.out.println("Enter Id : ");
			id=sc.nextInt();
			System.out.println("Enter Update phone-Number : ");
			String phone=sc.next();
			boolean x=studentService.updatePhone(id,phone);
			if(x) {
				System.out.println("Update done");
			}else {
				System.out.println("Not Update");
			}
			break;
		case 8:
			sc.close();
			
			System.out.println("Thank for Visiting");
			System.exit(0);
			break;
			default :
				System.out.println("Wrong Choise ! Try Again !");
		}

	}while(choise !=9);
}
	
	}


