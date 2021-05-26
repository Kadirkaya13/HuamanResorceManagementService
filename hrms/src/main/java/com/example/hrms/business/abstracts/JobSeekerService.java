package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	void add( JobSeeker  jobSeeker);
	void update(JobSeeker  jobSeeker);
	void delete(JobSeeker  jobSeeker);
	List<JobSeeker> getAll();
}
