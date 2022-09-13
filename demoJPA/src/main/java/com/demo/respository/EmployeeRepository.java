package com.demo.respository;

//import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

//	public List<Employee> findById(int id);
//	public List<Employee> findAll();
//	public Employee post(Employee employee);
//	
//	public void put(Employee employee);
//	void delete(int id);
	
}
