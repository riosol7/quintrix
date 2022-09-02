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

//	@Override
//	public Employee getEmployee(int id) {
//		// TODO Auto-generated method stub
//		return employeeDAO.findById(id);
//	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDAO.findAll();
	}

	@Override
	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.add(employee);
	}

	@Override
	public int updateEmployee(Employee employee, int id) {
		// TODO Auto-generated method stub
		return employeeDAO.update(employee, id);
	}

	@Override
	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeDAO.delete(id);
	}
	

}
