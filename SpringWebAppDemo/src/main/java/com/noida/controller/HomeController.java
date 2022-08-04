package com.noida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.noida.model.Student;
import com.noida.model.User;
import com.noida.service.StudentService;


@Controller
public class HomeController {
    private StudentService studentservice;
	
	@RequestMapping("/home")
	public String getHome(Model m) {
		m.addAttribute("home", "Uday Kolhe" );
		return "home";
	}
	
	@RequestMapping(path="/login")
	public String getLogin(@ModelAttribute User user) {
		return "login";
	}
	
	@RequestMapping(path="/signup" )
	public String addStudent() {
		return "signup";
	}
	
	@RequestMapping(path="/add" , method = RequestMethod.POST)
	public String getStudent(@ModelAttribute Student student) {
		System.out.println(student);
		return "studentdetails";
		
	}
}
