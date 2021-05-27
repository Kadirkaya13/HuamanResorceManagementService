package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.Employer;


public interface EmployerService {
	Result add(Employer employer);
	Result update(Employer employer);
	Result delete(Employer employer);
	Result login(Employer employer);
	Result register(Employer employer);
	DataResult<List<Employer>> getAll();
}
