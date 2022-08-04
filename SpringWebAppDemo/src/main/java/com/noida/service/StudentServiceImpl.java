package com.noida.service;

import com.noida.dao.StudentDAO;
import com.noida.dao.StudentDAOImpl;

public class StudentServiceImpl implements StudentService {
    private StudentDAO studentdao;

	public StudentServiceImpl() {
		this.studentdao=new StudentDAOImpl();
	}
	
	

    
    
	
}
