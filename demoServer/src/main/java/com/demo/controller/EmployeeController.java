package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.RestService;


@RestController
public class EmployeeController {
	

	@Autowired
	RestService restService;

	
	@GetMapping("/employee/{id}")
	public Employee findById(@PathVariable int id) {

		return restService.findById(id);
	};
	
	@GetMapping("/employee")
	public List <Employee> findAll(){
		
		return restService.findAll();
	};

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public Employee post(@RequestBody Employee employee) {

		return restService.post(employee);
	};

	@PutMapping("/employee")
	public void put(@RequestBody Employee employee) {

		restService.put(employee);

	}

	@DeleteMapping("/employee/{id}")
	public void delete(@PathVariable int id) {

		restService.delete(id);
	}

}
