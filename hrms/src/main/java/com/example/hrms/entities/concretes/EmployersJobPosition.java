package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employers_job_positions")
public class EmployersJobPosition {
	@Id
	@Column(name="employer_job_id")
	private int employerjobId;
	
	@Column(name="job_position_id")
	private int jobPositionId;

	public EmployersJobPosition(int employerjobId, int jobPositionId) {
		super();
		this.employerjobId = employerjobId;
		this.jobPositionId = jobPositionId;
	}
}
