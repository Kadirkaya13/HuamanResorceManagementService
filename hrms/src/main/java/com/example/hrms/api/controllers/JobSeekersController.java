package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.core.abstracts.EmailVerificationService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccessDataResult;
import com.example.hrms.core.results.SuccessResult;
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
	@PostMapping("/add")
	public Result add(JobSeeker jobSeeker) {
		
		return jobSeekerService.add(jobSeeker);
	}
	@PostMapping("/update")
	public Result update(JobSeeker jobSeeker) {
		return jobSeekerService.update(jobSeeker);
	}
	@PostMapping("/delete")
	public Result delete(JobSeeker jobSeeker) {
		
		return jobSeekerService.delete(jobSeeker);
	}
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		
		return jobSeekerService.getAll();
	}
	@PostMapping("/login")
	public Result login(JobSeeker jobSeeker) {
		return jobSeekerService.login(jobSeeker);
	}
	@PostMapping("/register")
	public Result register(JobSeeker jobSeeker) {
		return jobSeekerService.register(jobSeeker);
	}
	
}
