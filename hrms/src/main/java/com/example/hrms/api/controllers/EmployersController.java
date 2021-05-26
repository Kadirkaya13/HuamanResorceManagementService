package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	EmployerService employerService;
	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	@GetMapping("/add")
	public void add(Employer employer) {
		employerService.add(employer);
	}
	@GetMapping("/update")
	public void update(Employer employer) {
		employerService.update(employer);
	}
	@GetMapping("/delete")
	public void delete(Employer employer) {
		employerService.delete(employer);
	}
	@GetMapping("/getall")
	public List<Employer> getAll(){
		return employerService.getAll();
	}
}
