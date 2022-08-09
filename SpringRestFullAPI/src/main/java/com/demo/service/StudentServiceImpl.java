package com.demo.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	public int addStudent(Student std) {
		return studentDao.save(std );
	}

	public List<Student> displayAll() {
		return studentDao.findAll();
	}

	public Student getById(int id) throws EmptyResultDataAccessException {
		return studentDao.getById(id);
	}

//	public boolean updatePhone(int id, String phone) {
//		return studentDao.updateMobileNo(id, phone);
//	}

	public boolean deleteById(int id) {
		return studentDao.deleteById(id);
	}

	public List<Student> searchByName(String nm) {
		return studentDao.getByName(nm);
	}

	public int updateStudent(Student student) {
		return studentDao.updateStudent(student);
		
	}
}
