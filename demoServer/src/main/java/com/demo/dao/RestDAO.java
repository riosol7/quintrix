package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Employee;

@Component
public class RestDAO implements DAO<Employee> {

	@Autowired
	RestTemplate restTemplate;
	
	@Value("${employee.url}")
	String url;
	
	@Override
	public List<Employee> findById(int id) {
		
		ResponseEntity<List<Employee>> res = ResponseEntity.ok(restTemplate.getForObject(url + id, List.class));
		
		return res.getBody();
	}

	@Override
	public List<Employee> findAll() {
		
		ResponseEntity<List<Employee>> res = ResponseEntity.ok(restTemplate.getForObject(url, List.class));
		
		return res.getBody();
	}

	@Override
	public Employee post(Employee employee) {
		
		HttpEntity<Employee> req = new HttpEntity<>(employee);

		return restTemplate.postForObject(url, req, Employee.class);
	}

	@Override
	public void put(Employee employee) {

		HttpEntity<Employee> req = new HttpEntity<>(employee);
		restTemplate.put(url, req);
	}

	@Override
	public void delete(int id) {

		restTemplate.delete(url + id);
		
	}

}
