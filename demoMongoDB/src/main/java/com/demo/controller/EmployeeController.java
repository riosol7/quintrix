package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.repo.EmployeeRepo;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepo repo;
	
	@GetMapping("/employee")
	public List<Employee> findAll() {
		return repo.findAll();
	};
	
	@GetMapping("/employee/{id}")
	public Employee findById(@PathVariable int id) {
		return repo.findById(id).orElse(null);
	}
}
