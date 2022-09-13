package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/{id}")
	public Employee findById(@PathVariable("id") int id){
		return employeeService.findById(id);
	};
	
	@GetMapping
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
	@PostMapping
	public Employee post(@RequestBody Employee employee) {
		return employeeService.post(employee);
	}
	
	@PutMapping
	public void put(@RequestBody Employee employee) {
		employeeService.put(employee);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		employeeService.delete(id);
	}
	
	
}
