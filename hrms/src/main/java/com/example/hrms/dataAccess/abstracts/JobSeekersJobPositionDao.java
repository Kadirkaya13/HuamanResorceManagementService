package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.JobSeekersJobPosition;

public interface JobSeekersJobPositionDao extends JpaRepository<JobSeekersJobPosition,Integer>{

}
