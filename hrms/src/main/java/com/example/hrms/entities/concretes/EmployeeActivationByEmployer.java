package com.example.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_activation_by_employers")
public class EmployeeActivationByEmployer {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="employer_id")
	private int employerId;
	
	@Column(name="confirmed_employee_id")
	private int confirmedEmployeeId;
	
	@Column(name="is_confirmed")
	private boolean isConfirmed;
	
	@Column(name="confirmed_date")
	private Date confirmedDate;

	public EmployeeActivationByEmployer(int id, int employerId, int confirmedEmployeeId, boolean isConfirmed,
			Date confirmedDate) {
		super();
		this.id = id;
		this.employerId = employerId;
		this.confirmedEmployeeId = confirmedEmployeeId;
		this.isConfirmed = isConfirmed;
		this.confirmedDate = confirmedDate;
	}
	
	
}
