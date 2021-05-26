package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmployerJobPositionService;
import com.example.hrms.dataAccess.abstracts.EmployerJobPositionDao;
import com.example.hrms.entities.concretes.EmployersJobPosition;
@Service
public class EmployerJobPositionManager implements EmployerJobPositionService {

	EmployerJobPositionDao employerJobPositionDao;
	
	@Autowired
	public EmployerJobPositionManager(EmployerJobPositionDao employerJobPositionDao) {
		super();
		this.employerJobPositionDao = employerJobPositionDao;
	}

	@Override
	public void add(EmployersJobPosition employerJobPosition) {
		employerJobPositionDao.save(employerJobPosition);
		
	}

	@Override
	public void update(EmployersJobPosition employerJobPosition) {
		employerJobPositionDao.save(employerJobPosition);
		
	}

	@Override
	public void delete(EmployersJobPosition employerJobPosition) {
		employerJobPositionDao.deleteById(employerJobPosition.getEmployerjobId());
		
	}

	@Override
	public List<EmployersJobPosition> getAll() {
		
		return employerJobPositionDao.findAll();
	}

}
