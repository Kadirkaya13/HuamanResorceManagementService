package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.CandidateLink;

public interface CandidateLinkDao extends JpaRepository<CandidateLink, Integer>{

}
