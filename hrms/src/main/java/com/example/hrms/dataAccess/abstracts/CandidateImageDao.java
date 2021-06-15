package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.CandidateImage;

public interface CandidateImageDao extends JpaRepository<CandidateImage, Integer> {

}
