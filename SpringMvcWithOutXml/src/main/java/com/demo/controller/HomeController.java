package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/hello")
	public ModelAndView home() {
		String msg= "This is my home page";
		return new ModelAndView("hello","msg",msg);
	}
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}

}
