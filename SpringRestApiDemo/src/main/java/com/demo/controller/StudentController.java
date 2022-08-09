package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.demo.model.Student;
import com.demo.service.StudentService;

@RestController
@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"com.demo"})
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService; 

	@GetMapping("/students")
	public List<Student> getAllStudent(){
		return studentService.displayAll();
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable int id) {
		Student student= studentService.getById(id);
		if(student!=null) {
			return ResponseEntity.ok(student);
		}else {
			return (ResponseEntity<Student>) ResponseEntity.badRequest();
		}
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student  ) {
		studentService.addStudent(student);
	    return studentService.getById(student.getId());
	}
	
	
}
