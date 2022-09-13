package com.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.Employee;

@Repository
@Transactional
public class EmployeeDAO implements DAO <Employee>{
	
	@PersistenceContext
	EntityManager manager;

	@Override
	public List<Employee> findAll() {
		List<Employee> employee = manager.createQuery("SELECT a FROM EmployeeEntity a", Employee.class).getResultList();
		
		return employee;
	}

	@Override
	public List<Employee> findById(int id) {
		List<Employee> employee = manager.createQuery("SELECT a FROM EmployeeEntity a WHERE id = " + id, Employee.class).getResultList();
		
		return employee;
//		return manager.find(Employee, id);
	}

	@Override
	public Employee post(Employee employee) {
		manager.persist(employee);
		
		return employee;	
	}

	@Override
	public void put(Employee object) {
		
	}

	@Override
	public void delete(int id) {
		try {
			manager.remove(id);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
