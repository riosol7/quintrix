package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Employee>> findAll() {
		return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
	};
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> findById(@PathVariable String id) {
		return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Employee> post(@RequestBody Employee employee) {
		return new ResponseEntity<>(service.post(employee), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Employee> put(@RequestBody Employee employee) {
		return new ResponseEntity<>(service.put(employee), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable String id) {
		return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
	}
	
}
