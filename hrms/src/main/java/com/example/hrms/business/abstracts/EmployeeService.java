package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.Employee;

public interface EmployeeService {
	Result login(Employee employee); 
	Result register(Employee employee);
	DataResult<List<Employee>> getAll();

}
