package com.example.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.core.results.DataResult;
import com.example.hrms.entities.concretes.CandidateEducation;

public interface CandidateEducationDao extends JpaRepository<CandidateEducation, Integer> {
//	DataResult<List<CandidateEducation>> getAllBySortedTime();

}
