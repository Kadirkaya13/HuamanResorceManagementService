package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entities.concretes.Employee;

public interface EmployeeService {
	void add(Employee employee);
	void update(Employee employee);
	void delete(Employee employee);
	List<Employee> getAll();

}
