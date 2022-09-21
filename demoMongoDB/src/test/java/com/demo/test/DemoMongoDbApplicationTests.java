package com.demo.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.demo.entity.Employee;
import com.demo.repo.EmployeeRepo;
import com.demo.service.EmployeeService;

@SpringBootTest
class DemoMongoDbApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private EmployeeService service;
	
	@MockBean
	private EmployeeRepo repo;
	
	@Test
	public void findAllTest() {
		when(repo.findAll()).thenReturn(Stream.of(new Employee("junit", "mockito")).collect(Collectors.toList()));
		assertEquals(1, service.findAll().size());
	}
	
	

}
