package com.demo.dao;

import java.util.List;

public interface DAO<T> {
	Object findById(int id);
	List<T> findAll();
	int add(T newObject);
	int update(T newObject, int id);
	int delete(int id);
}
