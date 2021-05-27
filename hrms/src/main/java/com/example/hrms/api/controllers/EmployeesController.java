package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.EmployeeService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccessDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.entities.concretes.Employee;
import com.example.hrms.entities.concretes.Employer;
@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	EmployeeService employeeService;
	
	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@PostMapping("/login")
	public Result login(Employee employee) {
		employeeService.login(employee);
		return new SuccessResult();
	}
	@PostMapping("/register")
	public Result register(Employee employee) {
		employeeService.register(employee);
		return new SuccessResult();
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll(){
		employeeService.getAll();
		return new SuccessDataResult<List<Employee>>();
	}
}
