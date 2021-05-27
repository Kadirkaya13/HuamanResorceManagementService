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
@Table(name="employers_job_positions")
@AllArgsConstructor
@NoArgsConstructor
public class EmployersJobPosition {
	@Id
	@Column(name="employer_job_id")
	private int employerjobId;
	
	@Column(name="job_position_id")
	private int jobPositionId;

	
}
