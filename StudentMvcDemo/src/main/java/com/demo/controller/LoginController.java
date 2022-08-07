package com.demo.controller;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.User;
import com.demo.service.LoginService;


@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	
    
	
	/*public ModelAndView validateUser(HttpServletRequest request) {
		String uname=request.getParameter("user");
		String pass = request.getParameter("pass");
		return null;
	}*/
	
//	@RequestMapping(value="/validateUser" ,method = RequestMethod.POST)
	@PostMapping("/validateUser")
	public ModelAndView validateUser(@RequestParam("user") String user , @RequestParam String pass) {
		User u = loginService.validateUser(user,pass);
		if(u!=null) {
			return new ModelAndView("redirect:/student/viewStudents");
		}else {
			return new ModelAndView("login" ,"msg","ReEnter Details");
			}
	}
}
