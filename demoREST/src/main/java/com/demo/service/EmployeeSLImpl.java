package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDAO;
import com.demo.model.Employee;

@Service
public class EmployeeSLImpl implements EmployeeSL {
	
	@Autowired
	EmployeeDAO employeeDAO;

	@Override
	public List<Employee> findById(int id) {
		// TODO Auto-generated method stub
		return employeeDAO.findById(id);
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDAO.findAll();
	}

	@Override
	public Employee post(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.post(employee);
	}

	@Override
	public void put(Employee employee) {
		// TODO Auto-generated method stub
		employeeDAO.put(employee);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		employeeDAO.delete(id);
	}
	

}
