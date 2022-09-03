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
	@RequestMapping(method = RequestMethod.GET, value = "/employees")
	public List<Employee> employees() {
		return employeeSL.getEmployees();
	};
	
	// One employee by ID
	@RequestMapping(method = RequestMethod.GET, value = "/employee/{id}")
	public Object getEmployee(@PathVariable int id) {
		return employeeSL.getEmployee(id);
	};
	
	//CREATE - new employee
	@PostMapping("/employee")
	public int addEmployee(@RequestBody Employee employee) {
		return employeeSL.addEmployee(employee);
	};
	
	//UPDATE - existing record
	@PutMapping("/employee/{id}")
	public int updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		return employeeSL.updateEmployee(employee, id);
	};
	
	//DELETE - record
	@DeleteMapping("employee/{id}")
	public int deleteEmployee(@PathVariable int id) {
		return employeeSL.deleteEmployee(id);
	};
	
}
