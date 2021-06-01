package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.CandidateService;
import com.example.hrms.core.abstracts.EmailVerificationService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccessDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.entities.concretes.Candidates;
@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	CandidateService jobSeekerService;
	@Autowired
	public CandidatesController(CandidateService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	@PostMapping("/add")
	public Result add(Candidates jobSeeker) {
		
		return jobSeekerService.add(jobSeeker);
	}
	@PostMapping("/update")
	public Result update(Candidates jobSeeker) {
		return jobSeekerService.update(jobSeeker);
	}
	@PostMapping("/delete")
	public Result delete(Candidates jobSeeker) {
		
		return jobSeekerService.delete(jobSeeker);
	}
	@GetMapping("/getall")
	public DataResult<List<Candidates>> getAll(){
		
		return jobSeekerService.getAll();
	}
	@PostMapping("/login")
	public Result login(Candidates jobSeeker) {
		return jobSeekerService.login(jobSeeker);
	}
	@PostMapping("/register")
	public Result register(Candidates jobSeeker) {
		return jobSeekerService.register(jobSeeker);
	}
	
}
