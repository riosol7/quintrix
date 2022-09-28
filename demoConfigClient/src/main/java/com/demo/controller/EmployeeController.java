package com.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class EmployeeController {

	@Autowired
	private RestTemplate template;
	
	// From demoConfigClient's request goes to the demoConfigServer and in the properties file will provide the key
	// Provide the appropriate end point for the URL
	@Value("${insurance.provider.url}")
	private String url;
	
	@GetMapping("/getEmployee")
	public List<Employee> findAll() {
		List<Employee> employees = template.getForObject(url, List.class);
		return employees;
		
	};
}
