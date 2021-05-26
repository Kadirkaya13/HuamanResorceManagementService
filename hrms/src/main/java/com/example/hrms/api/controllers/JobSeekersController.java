package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.entities.concretes.JobSeeker;
@RestController
@RequestMapping("/api/jobseeker")
public class JobSeekersController {
	JobSeekerService jobSeekerService;
	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	@GetMapping("/add")
	public void add(JobSeeker jobSeeker) {
		jobSeekerService.add(jobSeeker);
	}
	@GetMapping("/update")
	public void update(JobSeeker jobSeeker) {
		jobSeekerService.update(jobSeeker);
	}
	@GetMapping("/delete")
	public void delete(JobSeeker jobSeeker) {
		jobSeekerService.delete(jobSeeker);
	}
	@GetMapping("/getall")
	public List<JobSeeker> getAll(){
		return jobSeekerService.getAll();
	}
	
}
