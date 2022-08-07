package com.noida.service;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

import com.noida.model.Student;



public interface StudentService {

	int addStudent();

	List<Student> displayAll();

	Student getById(int id) throws EmptyResultDataAccessException;

	boolean updatePhone(int id, String phone);

	boolean deleteById(int id);

	List<Student> searchByName(String nm);

	

	

}
