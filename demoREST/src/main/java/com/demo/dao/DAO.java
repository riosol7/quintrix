package com.demo.dao;

import java.util.List;

public interface DAO<T> {
	List<T> findById(int id);
	List<T> findAll();
	T post(T newObject);
	void put(T newObject);
	void delete(int id);
}
