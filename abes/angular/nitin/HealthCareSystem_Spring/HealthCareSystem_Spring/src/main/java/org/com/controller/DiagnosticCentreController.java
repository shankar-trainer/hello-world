package org.com.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.com.dao.DiagnosticCentreRepositories;
import org.com.exception.RecordNotFoundException;
import org.com.model.DiagnosticCentre;
import org.com.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diagnosticCentre")
@CrossOrigin("http://localhost:4200")
public class DiagnosticCentreController {
	
	@Autowired
	DiagnosticCentreRepositories dao;
	
	@RequestMapping("/allDiagnosticCentres")
	public List<DiagnosticCentre> getAllDiagnosticCentres(){
		return dao.findAll();
	}
	
	@RequestMapping("/searchDiagnosticCentre/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> findDiagnosticCentre1(@PathVariable("id") int diagnosticCentreid) {
		Optional<DiagnosticCentre> findById=dao.findById(diagnosticCentreid);
		try {
			if(findById.isPresent()) {
				DiagnosticCentre diagnosticCentre=findById.get();
				return new ResponseEntity<DiagnosticCentre>(diagnosticCentre,HttpStatus.OK);
			}
			else
				throw new RecordNotFoundException("Diagnostic Centre not found");
		}
		catch(RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
//	@RequestMapping("/searchDiagnosticCentre/{id}")
//	public DiagnosticCentre findDiagnosticCentre(@PathVariable("id") int diagnosticCentreid) {
//		Optional<DiagnosticCentre> findById=dao.findById(diagnosticCentreid);
//		if(findById.isPresent())
//			return findById.get();
//		
//		return null;
//	}
	
//	@PostMapping("/addAppointment")
//	public String saveAppointment(@RequestBody Appointment appointment1) {
//		Optional<Appointment> findById=dao.findById(appointment1.getAppointmentId());
//		if(!findById.isPresent()) {
//			dao.save(appointment1);
//			return "appointment added";
//		}
//		
//		return "appointment already exists";
//	}
	
	@PostMapping("/addDiagnosticCentre")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<DiagnosticCentre> saveDiagnosticCentre(@RequestBody DiagnosticCentre diagnosticCentre2) {
		Optional<DiagnosticCentre> findById=dao.findById(diagnosticCentre2.getDiagnosticCentreId());
		try{
			if(!findById.isPresent()) {
				dao.save(diagnosticCentre2);
				return new ResponseEntity<DiagnosticCentre>(diagnosticCentre2, HttpStatus.OK);
			}
			else
				throw new RecordNotFoundException("Diagnostic Centre already present...");
		}
		catch(RecordNotFoundException e){
			return new ResponseEntity<DiagnosticCentre>(diagnosticCentre2, HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/deleteDiagnosticCentre/{id}")
	public String removeDiagnosticCentre(@PathVariable("id") int diagnosticCentreid) {
		Optional<DiagnosticCentre> findById=dao.findById(diagnosticCentreid);
		if(findById.isPresent()) {
			dao.deleteById(diagnosticCentreid);
			return "Diagnostic Centre removed";
		}
		
		return "Diagnostic Centre not present";
	}
	
	@PutMapping("/updateDiagnosticCentre")
    public ResponseEntity<DiagnosticCentre> updateDiagnosticCentre(@Valid @RequestBody DiagnosticCentre diagnosticCentre) {

        Optional<DiagnosticCentre> findById = dao.findById(diagnosticCentre.getDiagnosticCentreId());
        try {
            if (findById.isPresent()) {
                dao.save(diagnosticCentre);
                return new ResponseEntity<DiagnosticCentre>(diagnosticCentre, HttpStatus.OK);
            	} 
            else {
                throw new RecordNotFoundException("Diagnostic Centre not present");
            }
        }
        catch (RecordNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
	
//	@PutMapping("/updateDiagnosticCentre")
//	public String updateDiagnosticCentre(@RequestBody DiagnosticCentre diagnosticCentre) {
//		Optional<DiagnosticCentre> findById=dao.findById(diagnosticCentre.getDiagnosticCentreId());
//		if(findById.isPresent()) {
//			dao.save(diagnosticCentre);
//			return "Diagnostic Centre updated";
//		}
//		
//		return "Diagnostic Centre not present";
//	}

}
