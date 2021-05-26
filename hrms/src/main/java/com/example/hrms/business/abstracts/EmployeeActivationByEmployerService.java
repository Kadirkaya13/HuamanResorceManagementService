package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entities.concretes.EmployeeActivationByEmployer;

public interface EmployeeActivationByEmployerService {
	void add(EmployeeActivationByEmployer activationByEmployer);
	void update(EmployeeActivationByEmployer activationByEmployer);
	void delete(EmployeeActivationByEmployer activationByEmployer);
	List<EmployeeActivationByEmployer> getAll();
	
}
