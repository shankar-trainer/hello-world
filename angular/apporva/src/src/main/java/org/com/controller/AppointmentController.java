package org.com.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.com.dao.AppointmentRepositories;
import org.com.error.RecordNotFoundException;
import org.com.model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appoint")
public class AppointmentController {
	
	@Autowired
	AppointmentRepositories dao;
	
	@RequestMapping("/allAppointments")
	public List<Appointment> getAllAppointments(){
		return dao.findAll();
	}
	
	@RequestMapping("/searchAppointment/{id}")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<?> findAppointment1(@PathVariable("id") int appointmentid) {
		Optional<Appointment> findById=dao.findById(appointmentid);
		try {
			if(findById.isPresent()) {
				Appointment appointment=findById.get();
				return new ResponseEntity<Appointment>(appointment,HttpStatus.OK);
			}
			else
				throw new RecordNotFoundException("Record not found");
		}
		catch(RecordNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
//	@RequestMapping("/searchAppointment/{id}")
//	public Appointment findAppointment(@PathVariable("id") int appointmentid) {
//		Optional<Appointment> findById=dao.findById(appointmentid);
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
	
	@PostMapping("/addAppointment")
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<Appointment> saveAppointment2(@RequestBody Appointment appointment2) {
		Optional<Appointment> findById=dao.findById(appointment2.getAppointmentId());
		try{
			if(!findById.isPresent()) {
				dao.save(appointment2);
				return new ResponseEntity<Appointment>(appointment2, HttpStatus.OK);
			}
			else
				throw new RecordNotFoundException("Record already present...");
		}
		catch(RecordNotFoundException e){
			return new ResponseEntity<Appointment>(appointment2, HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/deleteAppointment/{id}")
	public String removeAppointment(@PathVariable("id") int appointmentid) {
		Optional<Appointment> findById=dao.findById(appointmentid);
		if(findById.isPresent()) {
			dao.deleteById(appointmentid);
			return "Appointment removed";
		}
		
		return "Appointment not present";
	}
	
	@PutMapping("/updateAppointment")
    public ResponseEntity<Appointment> updateAppointment(@Valid @RequestBody Appointment appoint) {

        Optional<Appointment> findById = dao.findById(appoint.getAppointmentId());
        try {
            if (findById.isPresent()) {
                dao.save(appoint);
                return new ResponseEntity<Appointment>(appoint, HttpStatus.OK);
            	} 
            else {
                throw new RecordNotFoundException("Appointment not present");
            }
        }
        catch (RecordNotFoundException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
	
//	@PutMapping("/updateAppointment")
//	public String updateAppointment(@RequestBody Appointment appointment) {
//		Optional<Appointment> findById=dao.findById(appointment.getAppointmentId());
//		if(findById.isPresent()) {
//			dao.save(appointment);
//			return "Appointment updated";
//		}
//		
//		return "Appointment not present";
//	}

}
