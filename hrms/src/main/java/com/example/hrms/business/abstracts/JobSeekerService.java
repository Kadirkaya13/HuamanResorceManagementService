package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	Result add( JobSeeker  jobSeeker);
	Result update(JobSeeker  jobSeeker);
	Result delete(JobSeeker  jobSeeker);
	Result login(JobSeeker  jobSeeker);
	Result register(JobSeeker  jobSeeker);
	DataResult<List<JobSeeker>> getAll();
}
