package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.EmployeeActivationByEmployerService;
import com.example.hrms.entities.concretes.EmployeeActivationByEmployer;

@RestController
@RequestMapping("/api/employeeactivationbyemployer")
public class EmployeeActivationByEmployersController {
	
	private EmployeeActivationByEmployerService employeeActivationByEmployerService;

	@Autowired
	public EmployeeActivationByEmployersController(EmployeeActivationByEmployerService employeeActivationByEmployerService) {
		super();
		this.employeeActivationByEmployerService = employeeActivationByEmployerService;
	}
	@GetMapping("/add")
	public void add(EmployeeActivationByEmployer employeeActivationByEmployer) {
		employeeActivationByEmployerService.add(employeeActivationByEmployer);
	}
	@GetMapping("/update")
	public void update(EmployeeActivationByEmployer employeeActivationByEmployer) {
		employeeActivationByEmployerService.update(employeeActivationByEmployer);
	}
	@GetMapping("/delete")
	public void delete(EmployeeActivationByEmployer employeeActivationByEmployer) {
		employeeActivationByEmployerService.delete(employeeActivationByEmployer);
	}
	@GetMapping("/getall")
	public List<EmployeeActivationByEmployer> getAll(){
		return employeeActivationByEmployerService.getAll();
	}
}
