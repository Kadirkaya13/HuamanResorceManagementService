package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobPositionService;
import com.example.hrms.dataAccess.abstracts.JobPositionDao;
import com.example.hrms.entities.concretes.JobPosition;
@Service
public class JobPositionManager implements JobPositionService{

	JobPositionDao jobPositionDao;
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public void add(JobPosition jobPosition) {
		jobPositionDao.save(jobPosition);
		
	}

	@Override
	public void update(JobPosition jobPosition) {
		jobPositionDao.save(jobPosition);
		
	}

	@Override
	public void delete(JobPosition jobPosition) {
		jobPositionDao.deleteById(jobPosition.getId());
		
	}

	@Override
	public List<JobPosition> getAll() {
		
		return jobPositionDao.findAll();
	}

}
