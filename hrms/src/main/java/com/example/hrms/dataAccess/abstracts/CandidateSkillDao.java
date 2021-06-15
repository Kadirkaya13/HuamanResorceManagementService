package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.CandidateSkill;

public interface CandidateSkillDao extends JpaRepository<CandidateSkill, Integer>{

}
