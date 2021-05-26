package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_seekers_job_positions")
public class JobSeekersJobPosition {
	@Id
	@Column(name="job_seeker_id")
	private int jobSeekerId;
	
	@Column(name="job_position_id")
	private int jobPositionId;

	public JobSeekersJobPosition(int jobSeekerId, int jobPositionId) {
		super();
		this.jobSeekerId = jobSeekerId;
		this.jobPositionId = jobPositionId;
	}
}
