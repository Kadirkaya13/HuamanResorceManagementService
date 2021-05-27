package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_seekers_job_positions")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekersJobPosition {
	@Id
	@Column(name="job_seeker_id")
	private int jobSeekerId;
	
	@Column(name="job_position_id")
	private int jobPositionId;

	
}
