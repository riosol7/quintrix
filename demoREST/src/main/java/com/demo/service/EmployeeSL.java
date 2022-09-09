package com.demo.service;

import java.util.List;

import com.demo.model.*;

public interface EmployeeSL {
	Employee findById(int id);
	List<Employee> findAll();
	Employee post(Employee employee);
	void put(Employee employee);
	void delete(int id);
	
}
