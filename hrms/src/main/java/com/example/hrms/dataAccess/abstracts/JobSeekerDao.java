package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.entities.concretes.JobSeeker;


public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer>{
	DataResult<JobSeeker> findByNationalId(String nationalId); 
}
