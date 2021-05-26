package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmployeeActivationByEmployerService;
import com.example.hrms.dataAccess.abstracts.EmployeeActivationByEmployerDao;
import com.example.hrms.entities.concretes.EmployeeActivationByEmployer;

@Service
public class EmployeeActivationByEmployerManager implements EmployeeActivationByEmployerService {
	
	 EmployeeActivationByEmployerDao employeeActivationByEmployerDao;
	@Autowired
	public EmployeeActivationByEmployerManager(EmployeeActivationByEmployerDao employeeActivationByEmployerDao) {
		super();
		this.employeeActivationByEmployerDao = employeeActivationByEmployerDao;
	}

	@Override
	public void add(EmployeeActivationByEmployer activationByEmployer) {
		employeeActivationByEmployerDao.save(activationByEmployer);
		
	}

	@Override
	public void update(EmployeeActivationByEmployer activationByEmployer) {
		employeeActivationByEmployerDao.save(activationByEmployer);
		
	}

	@Override
	public void delete(EmployeeActivationByEmployer activationByEmployer) {
		employeeActivationByEmployerDao.deleteById(activationByEmployer.getConfirmedEmployeeId());
		
	}

	@Override
	public List<EmployeeActivationByEmployer> getAll() {
		
		return employeeActivationByEmployerDao.findAll();
	}

}
