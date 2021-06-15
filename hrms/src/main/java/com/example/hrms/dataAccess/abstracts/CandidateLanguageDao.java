package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.CandidateLanguage;

public interface CandidateLanguageDao extends JpaRepository<CandidateLanguage, Integer>{

}
