package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.entities.concretes.Candidates;


public interface CandidateDao extends JpaRepository<Candidates,Integer>{
	DataResult<Candidates> findByNationalId(String nationalId); 
}
