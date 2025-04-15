package org.example.service;

import org.example.entity.Doctor;
import org.example.entity.Patient;
import org.example.repository.DoctorRepository;
import org.example.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    PatientRepository patientRepository;

    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public Doctor searchDoctorById(int id) {
        return doctorRepository.findById(id).get();
    }

    public Doctor deleteDoctorById(int id) {
        Doctor doctor = doctorRepository.findById(id).get();
        doctorRepository.deleteById(id);
        return doctor;
    }

    public List<Doctor> getDoctorAll() {
        return doctorRepository.findAll();
    }

    public Doctor updateDoctorById(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    //-------------------- for patient

    public Patient addPatient(Patient patient, int doctorId) {
        List<Doctor> all = doctorRepository.findAll();
        for(Doctor d:all){
            if(d.getId()==doctorId){
                return patientRepository.save(patient);
            }
        }
        return  null;
    }

    public Patient searchPatientById(int id) {
        return patientRepository.findById(id).get();
    }

    public Patient deletePatientById(int id) {
        Patient patient = patientRepository.findById(id).get();
        patientRepository.deleteById(id);
        return patient;
    }

    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }

    public Patient updatePatientById(Patient patient) {
        return patientRepository.save(patient);
    }


}
