package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.EmployersJobPosition;


public interface EmployerJobPositionDao extends JpaRepository<EmployersJobPosition,Integer>{

}
