package com.example.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.entities.concretes.Candidate;
import com.example.hrms.entities.concretes.CandidateEducation;
import com.example.hrms.entities.dtos.CandidateResumeDto;


public interface CandidateDao extends JpaRepository<Candidate,Integer>{
	
	Candidate findByNationalId(String nationalId); 
	
//	List<Candidate> getAllBySortedTime();
	
//	@Query("From Candidate c "
//			+ "Inner Join c.candidateEducations ce "
//			+ "Inner join c.candidateExperiences cex"
//			+ "Inner Join c.candidateLanguages cl"
//			+ "Inner Join c.candidateLinks cli"
//			+ "Inner Join c.candidateSkills cs"
//			+ "Inner Join c.candidateImages ci"
//			+ "where candidate.id=:id and ")
//	List<CandidateResumeDto> getCandidate(int candidateId);
}
