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
		jobSeekerService.add(jobSeeker);
		return new SuccessResult();
	}
	@PostMapping("/update")
	public Result update(JobSeeker jobSeeker) {
		jobSeekerService.update(jobSeeker);
		return new SuccessResult();
	}
	@PostMapping("/delete")
	public Result delete(JobSeeker jobSeeker) {
		jobSeekerService.delete(jobSeeker);
		return new SuccessResult();
	}
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		jobSeekerService.getAll();
		return new SuccessDataResult<List<JobSeeker>>();
	}
	@PostMapping("/login")
	public Result login() {
		return new SuccessResult();
	}
	@PostMapping("/register")
	public Result register() {
		return new SuccessResult();
	}
	
}
