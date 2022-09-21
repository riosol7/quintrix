package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.entity.Employee;
import com.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo repo;
	
	public List<Employee> findAll() {
		System.out.println("Employees: "+ repo.findAll());
		return repo.findAll();
	};
	
	public Employee findById(String id) {
		return repo.findById(id).orElse(null);
	}
	
	public Employee post(Employee employee) {
		return repo.save(employee);
	}
	
	public Employee put(Employee employee) {
		Employee updatedEmployee = repo.findById(employee.getId()).orElse(null);
		
		updatedEmployee.setFirstName(employee.getFirstName());
		updatedEmployee.setLastName(employee.getLastName());
		updatedEmployee.setTickets(employee.getTickets());
		updatedEmployee.setAge(employee.getAge());
		
		return repo.save(updatedEmployee);
	}
	
	public String delete(String id) {
		repo.deleteById(id);
		return "Employee ID: " + id +  " has been deleted";
	}
	
}
