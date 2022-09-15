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
import com.demo.repo.EmployeeRepo;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepo repo;
	
	@GetMapping
	public List<Employee> findAll() {
		return repo.findAll();
	};
	
	@GetMapping("/{id}")
	public Employee findById(@PathVariable String id) {
		return repo.findById(id).orElse(null);
	}
	
	@PostMapping
	public Employee post(@RequestBody Employee employee) {
		return repo.save(employee);
	}
	
	@PutMapping
	public Employee put(@RequestBody Employee employee) {
		Employee updatedEmployee = repo.findById(employee.getId()).orElse(null);
		
		updatedEmployee.setFirstName(employee.getFirstName());
		updatedEmployee.setLastName(employee.getLastName());
		updatedEmployee.setTickets(employee.getTickets());
		
		return repo.save(updatedEmployee);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		repo.deleteById(id);
		return "Employee ID: " + id +  " has been deleted";
	}
	
}
