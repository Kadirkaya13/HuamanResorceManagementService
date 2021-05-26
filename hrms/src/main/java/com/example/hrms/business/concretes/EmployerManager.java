package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.dataAccess.abstracts.EmployerDao;
import com.example.hrms.entities.concretes.Employer;
@Service
public class EmployerManager implements EmployerService {

	EmployerDao  employerDao;
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public void add(Employer employer) {
		employerDao.save(employer);
		
	}

	@Override
	public void update(Employer employer) {
		employerDao.save(employer);
		
	}

	@Override
	public void delete(Employer employer) {
		employerDao.deleteById(employer.getId());
		
	}

	@Override
	public List<Employer> getAll() {
		return employerDao.findAll();
	}

}
