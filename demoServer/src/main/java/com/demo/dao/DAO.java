package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;


public interface DAO<T> {
	public List<Employee> findById(int id);
	public List<T> findAll();
	public T post(T object);
	public void put(T object);
	public void delete(int id);
}
