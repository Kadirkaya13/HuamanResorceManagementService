package com.example.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_advertisement")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name="job_position_id" , referencedColumnName = "id")
	private JobPosition jobPosition;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
	@Column(name="description")
	private String description;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="number_of_open_positions")
	private int numberOfOpenPositions;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="release_date")
	private Date releaseDate;
	
	@Column(name="deadline")
	private Date deadline;
	
}
