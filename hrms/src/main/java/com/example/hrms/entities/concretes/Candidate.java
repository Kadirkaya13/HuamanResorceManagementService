package com.example.hrms.entities.concretes;


import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="candidates")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="id")
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="national_id")
	private String nationalId;
	
	@OneToMany(mappedBy = "candidate")
    @JsonIgnore()
    private List<CandidateEducation> candidateEducations;

    @OneToMany(mappedBy = "candidate")
    @JsonIgnore()
    private List<CandidateExperience> candidateExperiences;

    @OneToMany(mappedBy = "candidate")
    @JsonIgnore()
    private List<CandidateLanguage> candidateLanguages;

    @OneToMany(mappedBy = "candidate")
    @JsonIgnore()
    private List<CandidateLink> candidateLinks;

    @OneToMany(mappedBy = "candidate")
    @JsonIgnore()
    private List<CandidateSkill> candidateSkills;

    @OneToMany(mappedBy = "candidate")
    @JsonIgnore()
    private List<CandidateImage> candidateImages;

	
}
