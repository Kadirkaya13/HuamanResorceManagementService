package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="system_employees")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="position_id")
	private int positionId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;

	public Employee(int id, int userId, int positionId, String firstName, String lastName) {
		super();
		this.id = id;
		this.userId = userId;
		this.positionId = positionId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	

}
