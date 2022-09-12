package com.demo.dao;

import java.util.List;

public interface DAO<T> {
	public List<T> findAll();
	public List<T> findById(int id);
	public T post(T object);
	public void put(T object);
	public void delete(int id);
}
