package com.example.demo;


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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.example.demo.Employee;

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
	public ResponseEntity<Object> postTest() {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		Employee ee = new Employee("test");
		
		String json = null;
		try {
			json = new ObjectMapper().writeValueAsString(ee);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		HttpEntity request = new HttpEntity(json, headers);
		return restTemplate.exchange("http://localhost:8080/employee", HttpMethod.POST, request, Object.class);		
	};

}
