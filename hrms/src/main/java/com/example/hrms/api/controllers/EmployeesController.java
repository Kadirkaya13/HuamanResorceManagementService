package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.EmployeeService;
import com.example.hrms.entities.concretes.Employee;
@RestController
@RequestMapping("/api/Employees")
public class EmployeesController {
	EmployeeService employeeService;
	
	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/add")
	public void add(Employee employee) {
		employeeService.add(employee);
	}
	@GetMapping("/update")
	public void update(Employee employee) {
		employeeService.update(employee);
	}
	@GetMapping("/delete")
	public void delete(Employee employee) {
		employeeService.delete(employee);
	}
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return employeeService.getAll();
	}
}
