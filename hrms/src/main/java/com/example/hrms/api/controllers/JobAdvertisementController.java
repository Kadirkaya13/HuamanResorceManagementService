package com.example.hrms.api.controllers;

import java.util.List;

import javax.persistence.PostUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobAdvertisementService;
import com.example.hrms.business.abstracts.UserService;
import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisements")
@CrossOrigin
public class JobAdvertisementController {
	
	JobAdvertisementService advertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService advertisementService,
			UserService userService) {
		super();
		this.advertisementService = advertisementService;
		
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return advertisementService.add(jobAdvertisement);
	}
	@PostUpdate
	@PostMapping("/update")
	public Result update(@RequestBody JobAdvertisement jobAdvertisement) {
		return advertisementService.update(jobAdvertisement);
	}
	@PostMapping("/delete")
	public Result delete(@RequestBody JobAdvertisement jobAdvertisement) {
		return advertisementService.delete(jobAdvertisement);
	}
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return advertisementService.getAll();
	}
	@GetMapping("/getallsorted")
	public DataResult<List<JobAdvertisement>> getAllSorted(){
		return advertisementService.getAllSorted();
	}
	@GetMapping("/getallbyactive")
	public DataResult<List<JobAdvertisement>> getByIsActive(){
		return advertisementService.getByIsActive();
	}
	@GetMapping("/getByIsActiveAndEmployer")
	public DataResult<List<JobAdvertisement>> getByIsActiveAndEmployer_CompanyName(boolean status, String companyName){
		return advertisementService.getByIsActiveAndEmployer_CompanyName(status, companyName);
	}
	@GetMapping("/getbyid")
	public DataResult<JobAdvertisement> getById(int id){
		return advertisementService.getById(id);
	}
}
