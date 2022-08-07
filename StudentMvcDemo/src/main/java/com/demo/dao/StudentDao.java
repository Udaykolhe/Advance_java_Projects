package com.demo.dao;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;

import com.demo.model.Student;

public interface StudentDao {

	int save(Student student);

	List<Student> findAll();

	Student getById(int id) throws EmptyResultDataAccessException;

// boolean updateMobileNo(int id , String phone);

	boolean deleteById(int id);

	List<Student> getByName(String nm);

	int updateStudent(Student student);

	
}
