package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entities.concretes.EmployersJobPosition;

public interface EmployerJobPositionService {
	void add(EmployersJobPosition employerJobPosition);
	void update(EmployersJobPosition employerJobPosition);
	void delete(EmployersJobPosition employerJobPosition);
	List<EmployersJobPosition> getAll();
}
