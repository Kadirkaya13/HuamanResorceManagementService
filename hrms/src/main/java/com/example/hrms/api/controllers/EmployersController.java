package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
public class EmployersController {
	EmployerService employerService;
	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@PostMapping("/add")
	public Result add(Employer employer) {
		employerService.add(employer);
		return new SuccessResult();
	}
	@PostMapping("/update")
	public Result update(Employer employer) {
		employerService.update(employer);
		return new SuccessResult();
	}
	@PostMapping("/delete")
	public Result delete(Employer employer) {
		employerService.delete(employer);
		return new SuccessResult();
	}
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		employerService.getAll();
		return new SuccessDataResult<List<Employer>>();
	}
	@PostMapping("/login")
	public Result login(Employer employer) {
		employerService.login(employer);
		return new SuccessResult();
	}
	@PostMapping("/register")
	public Result register(Employer employer) {
		employerService.register(employer);
		return new SuccessResult();
	}
}
