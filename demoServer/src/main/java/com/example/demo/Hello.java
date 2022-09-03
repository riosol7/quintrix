package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Hello {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/test")
	public String test() {
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/employee/1", String.class);
		return response.getBody();
	};
}
