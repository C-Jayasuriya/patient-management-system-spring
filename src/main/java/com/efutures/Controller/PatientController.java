package com.efutures.Controller;

import com.efutures.Dto.PatientDto;
import com.efutures.Entity.Patient;
import com.efutures.Service.PatientService;
import com.efutures.Util.PatientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class PatientController {
    @Autowired
    PatientService patientService;
    @Autowired
    PatientUtil patientUtil;
    @GetMapping("/logPatient")
    void logProfile(){
        patientService.log();
    }
    @PostMapping("/patient")
    public void savePatient(@RequestBody PatientDto patientDto, @RequestParam("doctorIds") Set<Integer> doctorIds) {
        Patient convertedPatient = patientUtil.convert(patientDto);
        patientService.addPatient(convertedPatient, doctorIds);
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

