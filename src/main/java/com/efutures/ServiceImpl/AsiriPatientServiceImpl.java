package com.efutures.ServiceImpl;

import com.efutures.Entity.Patient;
import com.efutures.Service.PatientService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@Profile(value = "qa")
public class AsiriPatientServiceImpl implements PatientService {

    @Override
    public void log() {
        System.out.println("Inside AsiriPatientServiceImpl");
    }

    @Override
    public void addPatient(Patient patient, Set<Integer> doctorIds){

    }
    @Override
    public Patient getPatientById(Integer id) {
        return null;
    }
    @Override
    public List<Patient> getAllPatients() {
        return null;
    }
    @Override
    public void updatePatient(Integer id, Patient updatedPatient) {

    }
    @Override
    public void deletePatientById(Integer id) {

    }
}
