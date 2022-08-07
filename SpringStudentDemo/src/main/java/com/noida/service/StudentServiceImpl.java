package com.noida.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.noida.dao.StudentDao;
import com.noida.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	public int addStudent() {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Student ID : ");
//		int id = sc.nextInt();
		System.out.println("Enter First name  : ");
		String firstname = sc.next();
		System.out.println("Enter last name: ");
		String lastname = sc.next();
		System.out.println("Enter phone : ");
		String phone = sc.next();
		System.out.println("Enter Email-Id : ");
		String email = sc.next();

		return studentDao.save(new Student(firstname, lastname, phone, email));
	}

	public List<Student> displayAll() {
		return studentDao.findAll();
	}

	@Override
	public Student getById(int id) throws EmptyResultDataAccessException {
		return studentDao.getById(id);
	}

	@Override
	public boolean updatePhone(int id, String phone) {
		return studentDao.updateMobileNo(id, phone);
	}

	@Override
	public boolean deleteById(int id) {
		return studentDao.deleteById(id);
	}

	@Override
	public List<Student> searchByName(String nm) {
		return studentDao.getByName(nm);
	}
}
