package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name="mernis")
@EqualsAndHashCode(callSuper = false)
public class Mernis {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="national_id")
	private String nationalId;

	public Mernis(int id, String nationalId) {
		super();
		this.id = id;
		this.nationalId = nationalId;
	}
}
