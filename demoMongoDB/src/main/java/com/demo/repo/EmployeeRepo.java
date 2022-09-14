package com.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.model.Employee;

//By extending the interface to MongoRepository, it loads the project with all the implementations needed (CRUD capabilities and more).
public interface EmployeeRepo extends MongoRepository <Employee, Integer> {
} 
