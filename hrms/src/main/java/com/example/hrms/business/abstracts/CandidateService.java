package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.core.results.Result;
import com.example.hrms.entities.concretes.Candidates;

public interface CandidateService {
	Result add( Candidates  jobSeeker);
	Result update(Candidates  jobSeeker);
	Result delete(Candidates  jobSeeker);
	Result login(Candidates  jobSeeker);
	Result register(Candidates  jobSeeker);
	DataResult<List<Candidates>> getAll();
}
