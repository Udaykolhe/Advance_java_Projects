package com.demo.service;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

import com.demo.model.Student;



public interface StudentService {

	int addStudent(Student std);

	List<Student> displayAll();

	Student getById(int id) throws EmptyResultDataAccessException;

//	boolean updateStudent(Student std);

	boolean deleteById(int id);

	List<Student> searchByName(String nm);

	int updateStudent(Student student);

	

	

}
