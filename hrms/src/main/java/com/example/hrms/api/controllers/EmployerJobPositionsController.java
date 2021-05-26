package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.EmployerJobPositionService;
import com.example.hrms.entities.concretes.EmployersJobPosition;

@RestController
@RequestMapping("/api/employerjobpositions")
public class EmployerJobPositionsController {
	EmployerJobPositionService employerJobPositionService;
	@Autowired
	public EmployerJobPositionsController(EmployerJobPositionService employerJobPositionService) {
		super();
		this.employerJobPositionService = employerJobPositionService;
	}
	@GetMapping("/add")
	public void add(EmployersJobPosition employersJobPosition) {
		employerJobPositionService.add(employersJobPosition);
	}
	@GetMapping("/update")
	public void update(EmployersJobPosition employersJobPosition) {
		employerJobPositionService.update(employersJobPosition);
	}
	@GetMapping("/delete")
	public void delete(EmployersJobPosition employersJobPosition) {
		employerJobPositionService.delete(employersJobPosition);
	}
	@GetMapping("/getall")
	public List<EmployersJobPosition> getAll(){
		return employerJobPositionService.getAll();
	}

}
