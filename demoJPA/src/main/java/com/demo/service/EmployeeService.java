package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.Employee;
import com.demo.respository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	public Employee findById(int id) {
		return employeeRepo.findById(id).orElse(null);
	}
	
	public List<Employee> findAll(){
		return employeeRepo.findAll();
	}
	
	public Employee post(Employee employee) {
		return employeeRepo.save(employee);
		
	}	
	
	public void put(Employee employee) {
		Employee prev = employeeRepo.findById(employee.getId()).orElse(null);
		prev.setDept(employee.getDept());
		prev.setFirstName(employee.getFirstName());
		prev.setLastName(employee.getLastName());
		employeeRepo.save(prev);
		
	}
	
	public void delete(int id) {
		employeeRepo.deleteById(id);
	}
 	
}
