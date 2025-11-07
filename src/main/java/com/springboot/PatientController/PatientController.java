package com.springboot.PatientController;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.springboot.Service.PatientService;
import com.springboot.model.Patient;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PatientController {
	
	@Autowired
	private PatientService patientService;

	@PostMapping("/savePatient")
	public ResponseEntity<?> InsertPatient(@RequestBody Patient patient)
	{
		return new ResponseEntity<>(patientService.savePatient(patient),HttpStatus.OK);
	}
	
	//GetAllPatient
	@GetMapping("/AllPatientDisplay")
	public ResponseEntity<List<Patient>> getALlPatient()
	{
		return new ResponseEntity<List<Patient>>(patientService.getAllPatient(),HttpStatus.OK);
	}
	
	//GetByIdPatient...
	@GetMapping("/{id}")
	public ResponseEntity<?> getByPatient(@PathVariable int id) throws Exception
	{
		return new ResponseEntity<>(patientService.getByPatientId(id),HttpStatus.OK);
	}
	
	//DeletePatient Id...
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletePatient(@PathVariable int id)
	{
		Boolean b=patientService.DeletePatient(id);
		if(b)
		{
			return new ResponseEntity<>("Patient is DeleteSuccessFully",HttpStatus.OK);
		}else
		{
			return new ResponseEntity<>("Something is wrong",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//UpdatePatient...
	@PutMapping("/update")
	public ResponseEntity<?> updatePatient(@RequestBody Patient patient) throws Exception{
		return new ResponseEntity<>(patientService.updatePatient(patient),HttpStatus.OK);
	}
	
}
