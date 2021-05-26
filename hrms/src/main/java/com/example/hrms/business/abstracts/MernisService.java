package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entities.concretes.Mernis;

public interface MernisService {
	void add( Mernis  mernis);
	void update(Mernis  mernis);
	void delete(Mernis  mernis);
	List<Mernis> getAll();
}
