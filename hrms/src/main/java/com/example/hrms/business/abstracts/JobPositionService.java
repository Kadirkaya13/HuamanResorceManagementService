package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	void add( JobPosition  jobPosition);
	void update(JobPosition  jobPosition);
	void delete(JobPosition  jobPosition);
	List<JobPosition> getAll();
}
