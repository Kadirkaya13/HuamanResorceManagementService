package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.dataAccess.abstracts.JobSeekerDao;
import com.example.hrms.entities.concretes.JobSeeker;
@Service
public class JobSeekerManager implements JobSeekerService{

	JobSeekerDao jobSeekerDao;
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public void add(JobSeeker jobSeeker) {
		jobSeekerDao.save(jobSeeker);
		
	}

	@Override
	public void update(JobSeeker jobSeeker) {
		jobSeekerDao.save(jobSeeker);
		
	}

	@Override
	public void delete(JobSeeker jobSeeker) {
		jobSeekerDao.deleteById(jobSeeker.getId());
		
	}

	@Override
	public List<JobSeeker> getAll() {
		
		return jobSeekerDao.findAll();
	}

}
