package com.demo.dao;


import com.demo.model.Employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO implements DAO <Employee>{
	
	/*
	It simplifies the use of JDBC and helps to avoid common errors.
	It executes core JDBC workflow, leaving application code to provide SQL and extract results.
	This class executes SQL queries or updates, initiating iteration over ResultSets and catching JDBC exceptions and translating them to the generic,
	more informative exception hierarchy defined in the org.srpringframeworl.dao package.
	*/
	@Autowired
	JdbcTemplate jdbcTemplate;

	//READ
	@Override
	public Employee findById(int id) {
		String sql = "SELECT * FROM userdb.employee WHERE id = ?";
		
		return (Employee) jdbcTemplate.query(sql, new Object[] {id}, new BeanPropertyRowMapper(Employee.class));
	}

	@Override
	public List<Employee> findAll() {

		String sql = "SELECT * FROM userdb.employee";
		
//      //A row mapper is used to match the data coming from the database to the attributes of the bean
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	//CREATE
	@Override
	public Employee post(Employee newEmployee) {

		Employee employee = new Employee();
		
		employee.setFirstname(newEmployee.getFirstname());
		employee.setLastname(newEmployee.getLastname());
		employee.setDept(newEmployee.getDept());
		
		String sql = "INSERT INTO userdb.employee(firstname, lastname, dept) VALUES('" + employee.getFirstname() + "', '" + employee.getLastname() + "', '" + employee.getDept() + "')";
		
		jdbcTemplate.update(sql);
		
		return employee;
	}

	//UPDATE
	@Override
	public void put(Employee employee) {
		
		String sql = "UPDATE userdb.employee SET firstname = ?, lastname = ?, dept = ? WHERE id = ?";
		
		jdbcTemplate.update(sql, employee.getFirstname(), employee.getLastname(), employee.getDept(), employee.getId());
		
	}

	//DELETE
	@Override
	public void delete(int id) {
	
		String sql = "DELETE FROM userdb.employee WHERE id = ?";
		
		jdbcTemplate.update(sql, id);
	}




}
