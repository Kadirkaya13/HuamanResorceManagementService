package com.example.hrms.entities.dtos;



import javax.persistence.PrimaryKeyJoinColumn;

import com.example.hrms.entities.concretes.Candidate;
import com.example.hrms.entities.concretes.CandidateEducation;
import com.example.hrms.entities.concretes.CandidateExperience;
import com.example.hrms.entities.concretes.CandidateImage;
import com.example.hrms.entities.concretes.CandidateLanguage;
import com.example.hrms.entities.concretes.CandidateLink;
import com.example.hrms.entities.concretes.CandidateSkill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@PrimaryKeyJoinColumn(name = "id")
@NoArgsConstructor
@AllArgsConstructor
public class CandidateResumeDto {
	
	
	private Candidate candidate;
	
	private CandidateEducation candidateEducations;
	
	private CandidateExperience candidateExperiences;
	
	private CandidateImage candidateImages;
	
	private CandidateLanguage candidateLanguages;
	
	private CandidateLink candidateLinks;
	
	private CandidateSkill candidateSkills;
}
