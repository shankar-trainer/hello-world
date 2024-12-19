package org.example.web;

import org.example.entity.Doctor;
import org.example.entity.Patient;
import org.example.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
@CrossOrigin("*")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor){
      System.out.println("addDoctor  called "+doctor);
        return  doctorService.addDoctor(doctor);
    }

    @GetMapping("/{id}")
    public Doctor searchDoctorById(@PathVariable("id") int id){
        return  doctorService.searchDoctorById(id);
    }

    @PutMapping()
    public Doctor updateDoctorById(@RequestBody Doctor doctor){
        return  doctorService.updateDoctorById(doctor);
    }

    @GetMapping
    public List<Doctor> getDoctorAll(){
        return  doctorService.getDoctorAll();
    }

    //-- patient

    @PostMapping("/addPatient/{did}")
    public Patient addPatient(@RequestBody  Patient patient, @PathVariable("did") int did) {
        return doctorService.addPatient(patient,did);
    }

    @GetMapping("/patient/{patientId}")
    public Patient searchPatientById(@PathVariable("id") int id) {
        return doctorService.searchPatientById(id);
    }

    @DeleteMapping("/patient/{patientId}")
    public Patient deletePatientById(int id) {
      return  doctorService.deletePatientById(id);
    }

    @GetMapping("/patient/patientall")
    public List<Patient> getAllPatient() {
        return  doctorService.getAllPatient();
    }

    @PutMapping("/patient")
    public Patient updatePatientById(Patient patient) {
        return doctorService.updatePatientById(patient);
    }

}
