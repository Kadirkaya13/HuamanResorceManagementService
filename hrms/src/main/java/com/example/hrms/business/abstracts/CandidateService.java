package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.Candidate;
import com.example.hrms.entities.dtos.CandidateResumeDto;

public interface CandidateService {
	Result add( Candidate  jobSeeker);
	Result update(Candidate  jobSeeker);
	Result delete(Candidate  jobSeeker);
	Result login(Candidate  jobSeeker);
	Result register(Candidate  jobSeeker);
	DataResult<List<Candidate>> getAll();
//	DataResult<List<Candidate>> getAllSortedTime();
//	DataResult<List<CandidateResumeDto>> getCandidateWithCv(int condidateId);
	
}
