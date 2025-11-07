package com.springboot.Service;

import java.util.List;

import com.springboot.model.Patient;

public interface PatientService {

	public Patient savePatient(Patient patient);
	
	public List<Patient> getAllPatient();
	
	public Patient getByPatientId(int id) throws Exception;
	
	public Boolean DeletePatient(int id);
	
	public Patient updatePatient(Patient patient) throws Exception; 
}
