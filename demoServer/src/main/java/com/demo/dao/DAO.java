package com.demo.dao;

import java.util.List;

public interface DAO<T> {
	public T findById(int id);
	public List<T> findAll();
	public T post(T object);
	public void put(T object);
	public void delete(int id);
}
