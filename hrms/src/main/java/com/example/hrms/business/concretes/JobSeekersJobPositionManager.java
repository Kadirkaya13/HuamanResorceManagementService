package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobSeekersJobPositionService;
import com.example.hrms.dataAccess.abstracts.JobSeekersJobPositionDao;
import com.example.hrms.entities.concretes.JobSeekersJobPosition;
@Service
public class JobSeekersJobPositionManager implements JobSeekersJobPositionService{

	JobSeekersJobPositionDao  jobSeekersJobPositionDao;
	
	@Autowired
	public JobSeekersJobPositionManager(JobSeekersJobPositionDao jobSeekersJobPositionDao) {
		super();
		this.jobSeekersJobPositionDao = jobSeekersJobPositionDao;
	}

	@Override
	public void add(JobSeekersJobPosition jobSeekersJobPosition) {
		jobSeekersJobPositionDao.save(jobSeekersJobPosition);
		
	}

	@Override
	public void update(JobSeekersJobPosition jobSeekersJobPosition) {
		jobSeekersJobPositionDao.save(jobSeekersJobPosition);
		
	}

	@Override
	public void delete(JobSeekersJobPosition jobSeekersJobPosition) {
		jobSeekersJobPositionDao.deleteById(jobSeekersJobPosition.getJobPositionId());
		
	}

	@Override
	public List<JobSeekersJobPosition> getAll() {
		
		return jobSeekersJobPositionDao.findAll();
	}

	

}
