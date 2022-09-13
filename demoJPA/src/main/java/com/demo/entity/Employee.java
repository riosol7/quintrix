package com.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity(name = "EmployeeEntity")
@Table(name = "employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "employee_id")
	@GeneratedValue
	private int id;
	
	String firstName;
	String lastName;
	String Dept;
	
	public void EmployeeEntity () {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

}
