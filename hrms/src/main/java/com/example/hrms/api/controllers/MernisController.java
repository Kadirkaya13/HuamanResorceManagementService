package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.MernisService;
import com.example.hrms.entities.concretes.Mernis;

@RestController
@RequestMapping("/api/mernis")
public class MernisController {
	MernisService mernisService;
	@Autowired
	public MernisController(MernisService mernisService) {
		super();
		this.mernisService = mernisService;
	}
	
	@GetMapping("/add")
	public void add(Mernis mernis) {
		mernisService.add(mernis);
	}
	@GetMapping("/update")
	public void update(Mernis mernis) {
		mernisService.update(mernis);
	}
	@GetMapping("/delete")
	public void delete(Mernis mernis) {
		mernisService.delete(mernis);
	}
	@GetMapping("/getall")
	public List<Mernis> getAll(){
		return mernisService.getAll();
	}
}
