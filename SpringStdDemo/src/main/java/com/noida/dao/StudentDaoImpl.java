package com.noida.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.noida.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
  
	@Autowired
	private JdbcTemplate jdbcTemplate;
    	
	public int save(Student student) {
		String sql="INSERT INTO student VALUES (?,?,?,?)";
		int num=jdbcTemplate.update(sql,new Object[] {student.getId(),student.getFirstname(),student.getLastname(),student.getPhone(),student.getEmail()} );
		
		return num;
		
	}
}
