package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.model.Employee;
import com.demo.service.EmployeeSL;

//Add PUT and DELETE; Correct the REST DESIGN (lvl 2 of Richardson Maturity Model), Make BE into 3 layers, use JDBCTemplate to query from DB.

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeSL employeeSL;
	
	//READ - all employees
	@RequestMapping(method = RequestMethod.GET, value = "/employee")
	public List<Employee> findAll() {
		return employeeSL.findAll();
	};
	
	// One employee by ID
	@RequestMapping(method = RequestMethod.GET, value = "/employee/{id}")
	public List<Employee> findById(@PathVariable int id) {
		return employeeSL.findById(id);
	};
	
	//CREATE - new employee
	@PostMapping("/employee")
	public Employee post(@RequestBody Employee employee) {
		return employeeSL.post(employee);
	};
	
	//UPDATE - existing record
	@PutMapping("/employee")
	public void put(@RequestBody Employee employee) {
		employeeSL.put(employee);
	};
	
	//DELETE - record
	@DeleteMapping("/employee/{id}")
	public void delete(@PathVariable int id) {
		employeeSL.delete(id);
	};
	
}
