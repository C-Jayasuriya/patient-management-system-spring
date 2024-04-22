package com.efutures.Service;

import com.efutures.Entity.Patient;

import java.util.List;
import java.util.Set;

public interface PatientService {
        public void log();
        public void addPatient(Patient patient, Set<Integer> doctorIds);
        public Patient getPatientById(Integer id) ;
        public List<Patient> getAllPatients() ;
        public void updatePatient(Integer id, Patient updatedPatient);
        public void deletePatientById(Integer id) ;
    }
