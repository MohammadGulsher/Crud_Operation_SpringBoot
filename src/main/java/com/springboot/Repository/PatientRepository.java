package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
