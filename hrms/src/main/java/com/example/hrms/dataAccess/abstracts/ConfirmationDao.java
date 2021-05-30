package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.Confirmation;

public interface ConfirmationDao extends JpaRepository<Confirmation, Integer>{

}
