package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.EmployeeService;
import com.example.hrms.core.abstracts.EmailVerificationService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccessDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.entities.concretes.Employee;
@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	EmployeeService employeeService;
	EmailVerificationService emailVerificationService;
	
	@Autowired
	public EmployeesController(EmployeeService employeeService,EmailVerificationService emailVerificationService) {
		super();
		this.employeeService = employeeService;
		this.emailVerificationService=emailVerificationService;
	}
	@PostMapping("/login")
	public Result login(@RequestBody Employee employee) {
	
		return 	employeeService.login(employee);
	}
	@PostMapping("/register")
	public Result register(@RequestBody Employee employee) {
		
		return employeeService.register(employee);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll(){
		
		return employeeService.getAll();
	}
	
}
