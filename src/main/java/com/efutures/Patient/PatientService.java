package com.efutures.Patient;

import java.util.List;

public interface PatientService {
        public void addPatient(Patient patient);
        public Patient getPatientById(Integer id) ;
        public List<Patient> getAllPatients() ;
        public void updatePatient(Integer id, Patient updatedPatient);
        public void deletePatientById(Integer id) ;
    }
