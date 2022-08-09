package com.demo.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int save(Student student) {
		String sql = "INSERT INTO students(firstname,lastname,phone,email) VALUES (?,?,?,?)";
		int data = jdbcTemplate.update(sql, new Object[] { 
//				student.getId(), 
				student.getFirstname(),
				student.getLastname(), 
				student.getPhone(),
				student.getEmail() 
				});
		return data;

	}
	
	// Find Students:------------
	public List<Student> findAll() {
		String sql = "SELECT * FROM students";
		List<Student> slist = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Student.class));
		return slist;
	}


	/*
	 * public List<Student> findAll() { 
	 * String sql="SELECT * FROM student"; 
	 * return  jdbcTemplate.query(sql,(rs,num)-> { 
	 * Student student = new Student();
	 * student.setId(rs.getInt(1));
	 * student.setFirstname(rs.getString(2));
	 * student.setLastname(rs.getString(3)); 
	 * student.setPhone(rs.getString(3));
	 * student.setEmail(rs.getString(4)); 
	 * return student; });
	 * 
	 * }
	 */

//	public List<Student> findAll() {
//		String sql = "SELECT * FROM students";
//		List<Student> slist = jdbcTemplate.query(sql, new RowMapper<Student>() {
//
//			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Student student = new Student();
//				student.setId(rs.getInt(1));
//				student.setFirstname(rs.getString(2));
//				student.setLastname(rs.getString(3));
//				student.setPhone(rs.getString(4));
//				student.setEmail(rs.getString(5));
//				return student;
//			}
//
//		});
//		return slist;
//	}
	
	
	// Find By Id:---------->
	@SuppressWarnings("deprecation")
	public Student getById(int id) throws EmptyResultDataAccessException {
		String sql = "SELECT * FROM students WHERE id=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, BeanPropertyRowMapper.newInstance(Student.class));

	}

	/*
	 * @Override public Student getById(int id) { String sql =
	 * "SELECT * FROM student WHERE id=?";
	 * 
	 * @SuppressWarnings("deprecation") Student std=
	 * jdbcTemplate.queryForObject(sql, new Object[] {id}, (rs,rownum)->{ Student
	 * student = new Student(); student.setId(rs.getInt(1));
	 * student.setFirstname(rs.getString(2)); student.setLastname(rs.getString(3));
	 * student.setPhone(rs.getString(4)); student.setEmail(rs.getString(5)); return
	 * student; }); return std;
	 * 
	 * }
	 */

	

//	public boolean updateMobileNo(int id, String phone) {
//		String sql = "UPDATE students SET phone=? WHERE id=?";
//		int n = jdbcTemplate.update(sql, new Object[] { phone, id });
//		if (n > 0) {
//			return true;
//		}
//		return false;
//
//	}

	public boolean deleteById(int id) {
		String sql = "DELETE FROM students WHERE id=?";
		int n = jdbcTemplate.update(sql, new Object[] { id });
		if (n > 0) {
			
			return true;
		}
		return false;
	}
	@SuppressWarnings("deprecation")
	public List<Student> getByName(String nm) {
		String sqlname="SELECT * FROM students WHERE firstname=?";
		List<Student> slist= jdbcTemplate.query(sqlname,new Object[] {nm}, BeanPropertyRowMapper.newInstance(Student.class) );
		return slist;
	}



	

	public int updateStudent(Student student) {
		String sql = "UPDATE students SET firstname=? , lastname=?, phone=?  WHERE id=?";
		return jdbcTemplate.update(sql, new Object[] { student.getFirstname(), student.getLastname(), student.getPhone() , student.getId()});
		
		
	}

	

	}
	

