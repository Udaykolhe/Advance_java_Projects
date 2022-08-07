package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Student;
import com.demo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping("/viewStudents")
	public ModelAndView getAllStudent() {
		List<Student> slist = studentService.displayAll();

		return new ModelAndView("displayStudents", "slist", slist);
	}

	@GetMapping("/addStudent")
	public String addStudent() {

		return "registration";
	}

	@PostMapping("/saveStudent")
	public ModelAndView saveStudent(@RequestParam String firstname, @RequestParam String lastname,
			@RequestParam String phone, @RequestParam String email) {
		Student std = new Student(firstname, lastname, phone, email);
		studentService.addStudent(std);

		return new ModelAndView("redirect:/student/viewStudents");
	}

	@GetMapping("/deleteStudent/{id}")
	public ModelAndView deleteStudent(@PathVariable int id) {
		studentService.deleteById(id);
		return new ModelAndView("redirect:/student/viewStudents");

	}

	@GetMapping("/editStudent/{id}")
	public ModelAndView editStudent(@PathVariable int id) {
		Student std = studentService.getById(id);
		return new ModelAndView("edit", "std", std);

	}

	@PostMapping("/updateStudent")
	public ModelAndView updateStudent(@RequestParam int id ,@RequestParam String firstname, @RequestParam String lastname,
			@RequestParam String phone) {
		 Student student = new Student(id,firstname, lastname, phone);
		 studentService.updateStudent(student);
		return new ModelAndView("redirect:/student/viewStudents");

	}
}
