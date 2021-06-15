package com.example.hrms.api.controllers;

import java.util.List;

import javax.persistence.PostUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.CandidateService;
import com.example.hrms.core.abstracts.EmailVerificationService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.core.results.SuccessDataResult;
import com.example.hrms.core.results.SuccessResult;
import com.example.hrms.entities.concretes.Candidate;
import com.example.hrms.entities.dtos.CandidateResumeDto;
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
	public Result add(@RequestBody Candidate jobSeeker) {
		
		return jobSeekerService.add(jobSeeker);
	}
	@PostUpdate
	@PostMapping("/update")
	public Result update(@RequestBody Candidate jobSeeker) {
		return jobSeekerService.update(jobSeeker);
	}
	@PostMapping("/delete")
	public Result delete(@RequestBody Candidate jobSeeker) {
		
		return jobSeekerService.delete(jobSeeker);
	}
	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll(){
		
		return jobSeekerService.getAll();
	}
	@PostMapping("/login")
	public Result login(@RequestBody Candidate jobSeeker) {
		return jobSeekerService.login(jobSeeker);
	}
	@PostMapping("/register")
	public Result register(@RequestBody Candidate jobSeeker) {
		return jobSeekerService.register(jobSeeker);
	}
	
//	@GetMapping("/getCandidateWithCv")
//	public DataResult<List<CandidateResumeDto>> getCandidateWithCv(int condidateId){
//		return jobSeekerService.getCandidateWithCv(condidateId);
//	}
	
}
