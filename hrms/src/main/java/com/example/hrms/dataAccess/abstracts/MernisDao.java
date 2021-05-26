package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.Mernis;

public interface MernisDao extends JpaRepository<Mernis,Integer>{

}
