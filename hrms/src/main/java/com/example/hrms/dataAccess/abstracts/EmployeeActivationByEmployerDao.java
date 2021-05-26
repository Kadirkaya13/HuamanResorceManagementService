package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.EmployeeActivationByEmployer;


public interface EmployeeActivationByEmployerDao extends JpaRepository<EmployeeActivationByEmployer,Integer>  {

}
