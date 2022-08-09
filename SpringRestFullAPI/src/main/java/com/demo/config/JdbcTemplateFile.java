package com.demo.config;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Configurable
@EnableWebMvc
@ComponentScan(basePackages = { "com.demo" })
//if give the classpath : file put into resources folder otherwise
//not give the classpath ; directly file put into WEB-INF
//@PropertySource("classpath:data.properties")
public class JdbcTemplateFile {

	
	@Bean
	public DataSource getDataSourse() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/noida22?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("Kazahks@5");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate= new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSourse());
		return jdbcTemplate;
	}
	
	

}
