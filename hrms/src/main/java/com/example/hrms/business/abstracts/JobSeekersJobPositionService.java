package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entities.concretes.JobSeekersJobPosition;

public interface JobSeekersJobPositionService {
	void add( JobSeekersJobPosition  jobSeekersJobPosition);
	void update(JobSeekersJobPosition  jobSeekersJobPosition);
	void delete(JobSeekersJobPosition  jobSeekersJobPosition);
	List<JobSeekersJobPosition> getAll();
}
