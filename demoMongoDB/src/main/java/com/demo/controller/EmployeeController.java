package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	EmployeeService service;
	
	@GetMapping
	public List<Employee> findAll() {
		return service.findAll();
	};
	
	@GetMapping("/{id}")
	public Employee findById(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	public Employee post(@RequestBody Employee employee) {
		return service.post(employee);
	}
	
	@PutMapping
	public Employee put(@RequestBody Employee employee) {
		return service.put(employee);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable String id) {
		return service.delete(id);
	}
	
}
