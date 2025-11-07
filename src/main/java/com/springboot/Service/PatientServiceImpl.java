package com.springboot.Service;

import java.lang.module.ResolutionException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.OpAnd;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.springboot.Exception.ResourceNotFoundException;
import com.springboot.Repository.PatientRepository;
import com.springboot.model.Patient;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientRepository patientRepository;
	@Override
	public Patient savePatient(Patient patient) {
		patient.setDate(LocalDateTime.now());
		return patientRepository.save(patient);
	}
	@Override
	public List<Patient> getAllPatient() {
		return patientRepository.findAll();
	}
	@Override
	public Patient getByPatientId(int id) throws Exception {
		Patient patient=patientRepository.findById(id).
				orElseThrow(()-> new ResourceNotFoundException("patient is Found is Id="+id));
		if(patient.getName()==null)
		{
			throw new IllegalArgumentException("name is null");
		}
		return patient;
	}
	@Override
	public Boolean DeletePatient(int id) {
		Patient p=patientRepository.findById(id).orElse(null);
		if(!ObjectUtils.isEmpty(p))
		{
			patientRepository.delete(p);
			return true;
		}
		return false;
	}
	@Override
	public Patient updatePatient(Patient patient) throws Exception {
		Patient p1=getByPatientId(patient.getId());
		if(!ObjectUtils.isEmpty(patient))
		{
			p1.setName(patient.getName());
			p1.setEmail(patient.getEmail());
			p1.setAddress(patient.getAddress());
			p1.setSunday(patient.getSunday());
			p1.setMonday(patient.getMonday());
			p1.setTuesday(patient.getTuesday());
			p1.setWednesday(patient.getWednesday());
			p1.setThursday(patient.getThursday());
			p1.setFriday(patient.getFriday());
			p1.setSaturday(patient.getSaturday());
			p1.setDate(patient.getDate());
			
			Patient p2=patientRepository.save(p1);
			return p2;
			
		}
		return patient;
	}

}
