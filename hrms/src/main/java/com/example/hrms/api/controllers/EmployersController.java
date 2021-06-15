package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccessDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
@CrossOrigin
public class EmployersController {
	EmployerService employerService;
	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		
		return employerService.add(employer);
	}
	@PostMapping("/update")
	public Result update(Employer employer) {
		
		return employerService.update(employer);
	}
	@PostMapping("/delete")
	public Result delete(Employer employer) {
		
		return employerService.delete(employer);
	}
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		
		return employerService.getAll();
	}
	@PostMapping("/login")
	public Result login(Employer employer) {
		
		return employerService.login(employer);
	}
	@PostMapping("/register")
	public Result register(Employer employer) {
		
		return employerService.register(employer);
	}
}
