package com.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;

@RestController
// To reflect every change to the provider/configServer, RefreshScope will instantly modify the client application
@RefreshScope
public class EmployeeController {

	@Autowired
	// Due to the refresh scope, will cause circular dependency injection to the rest template. 
	// To avoid this error we used the annotation @Lazy  
	@Lazy
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
