package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
	
}
