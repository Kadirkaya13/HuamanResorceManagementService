package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobSeekersJobPositionService;
import com.example.hrms.entities.concretes.JobSeekersJobPosition;

@RestController
@RequestMapping("/api/jobSeekersjobpositions")
public class JobSeekersJobPositionsController {
	JobSeekersJobPositionService jobSeekersJobPositionService;
	@Autowired
	public JobSeekersJobPositionsController(JobSeekersJobPositionService jobSeekersJobPositionService) {
		super();
		this.jobSeekersJobPositionService = jobSeekersJobPositionService;
	}
	@GetMapping("/add")
	public void add(JobSeekersJobPosition jobSeekersJobPosition) {
		jobSeekersJobPositionService.add(jobSeekersJobPosition);
	}
	@GetMapping("/update")
	public void update(JobSeekersJobPosition jobSeekersJobPosition) {
		jobSeekersJobPositionService.update(jobSeekersJobPosition);
	}
	@GetMapping("/delete")
	public void delete(JobSeekersJobPosition jobSeekersJobPosition) {
		jobSeekersJobPositionService.delete(jobSeekersJobPosition);
	}
	@GetMapping("/getall")
	public List<JobSeekersJobPosition> getAll(){
		return jobSeekersJobPositionService.getAll();
	}
}
