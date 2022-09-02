package com.demo.service;

import java.util.List;

import com.demo.model.*;

public interface EmployeeSL {
	Employee getEmployee(int id);
	List<Employee> getEmployees();
	int addEmployee(Employee employee);
	int updateEmployee(Employee employee, int id);
	int deleteEmployee(int id);
	
}
