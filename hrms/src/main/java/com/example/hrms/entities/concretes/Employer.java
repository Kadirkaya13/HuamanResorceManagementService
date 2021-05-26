package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employers")
public class Employer {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="job_id")
	private int jobId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_adress")
	private String webAdress;
	
	@Column(name="email")
	private String email;
	
	@Column(name="tel_number")
	private String phoneNumber;

	public Employer(int id, int jobId, String companyName, String webAdress, String email, String phoneNumber, int userId) {
		super();
		this.id = id;
		this.jobId = jobId;
		this.companyName = companyName;
		this.webAdress = webAdress;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.userId=userId;
	}
	
	
}
