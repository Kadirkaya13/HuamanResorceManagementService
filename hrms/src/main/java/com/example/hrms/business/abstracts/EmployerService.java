package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entities.concretes.Employer;


public interface EmployerService {
	void add(Employer employer);
	void update(Employer employer);
	void delete(Employer employer);
	List<Employer> getAll();
}
