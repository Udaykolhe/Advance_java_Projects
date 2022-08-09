package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.User;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@SuppressWarnings("deprecation")
	public User gerUserDetails(String user, String pass) {
		String sql = "SELECT * FROM user_login WHERE username=? and password=?";
		try {
		return jdbcTemplate.queryForObject(sql, new Object[] { user, pass },
				BeanPropertyRowMapper.newInstance(User.class));
		}catch(EmptyResultDataAccessException e){
			return null;
		}

	}
}
