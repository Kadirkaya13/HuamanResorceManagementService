package com.example.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer>{

	List<JobAdvertisement> getByIsActive(boolean status);
	
	List<JobAdvertisement> getByIsActiveAndEmployer_CompanyName(boolean status,String companyName);
	
	JobAdvertisement getById(int id);
}
