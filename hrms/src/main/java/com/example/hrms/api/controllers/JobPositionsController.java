package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobPositionService;
import com.example.hrms.entities.concretes.JobPosition;
@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
	JobPositionService jobPositionService;
	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/add")
	public void add(JobPosition jobPosition) {
		jobPositionService.add(jobPosition);
	}
	@GetMapping("/update")
	public void update(JobPosition jobPosition) {
		jobPositionService.update(jobPosition);
	}
	@GetMapping("/delete")
	public void delete(JobPosition jobPosition) {
		jobPositionService.delete(jobPosition);
	}
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return jobPositionService.getAll();
	}
}
