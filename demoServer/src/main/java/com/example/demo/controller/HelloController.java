package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Employee;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;

//import com.example.demo.Employee;

@RestController
public class HelloController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/test")
	public String getTest() {
		
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/employee/1", String.class);
		return response.getBody();
	};

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public ResponseEntity<Object> postTest(@RequestBody Employee employee) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		
		HttpEntity request = new HttpEntity(employee, headers);
		return restTemplate.exchange("http://localhost:8080/employee", HttpMethod.POST, request, Object.class);		
	};

}
