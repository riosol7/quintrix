package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.RestDAO;
import com.demo.model.Employee;

@Service
public class RestServiceImpl implements RestService {

	@Autowired
	RestDAO restDAO;
	
	@Override
	public List<Employee> findById(int id) {
		return restDAO.findById(id);
	}

	@Override
	public List<Employee> findAll() {
		return restDAO.findAll();
	}

	@Override
	public Employee post(Employee employee) {
		return restDAO.post(employee);
	}

	@Override
	public void put(Employee employee) {
		restDAO.put(employee);
	}

	@Override
	public void delete(int id) {
		restDAO.delete(id);
	}
	

}
