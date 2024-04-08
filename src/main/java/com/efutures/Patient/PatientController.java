package com.efutures.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    PatientService patientService;
    @PostMapping("/patient")
    public void savePatient(@RequestBody Patient patient) {
        patientService.addPatient(patient);
    }

    @GetMapping("/patient/{id}")
    public Patient getPatient(@PathVariable("id") Integer id){
        Patient patientById = patientService.getPatientById(id);
        return patientById;
    }

    @GetMapping("/patients")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @PutMapping("/patient/{id}")
    public void updatePatient(@PathVariable("id") Integer id, @RequestBody Patient updatedPatient) {
        patientService.updatePatient(id, updatedPatient);
    }

    @DeleteMapping("/patient/{id}")
    public void deletePatient(@PathVariable("id") Integer id) {
        patientService.deletePatientById(id);
    }
}

