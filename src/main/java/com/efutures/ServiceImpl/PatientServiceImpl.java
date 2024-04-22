package com.efutures.ServiceImpl;

import com.efutures.Entity.Doctor;
import com.efutures.Entity.Patient;
import com.efutures.Repository.PatientRepository;
import com.efutures.Service.DoctorService;
import com.efutures.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Profile(value = "dev")
@Transactional
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    private final DoctorService doctorService;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository, DoctorService doctorService) {
        this.patientRepository = patientRepository;
        this.doctorService = doctorService;
    }

    @Override
    public void log() {
        System.out.println("Inside PatientServiceImpl");
    }

    @Override
    public void addPatient(Patient patient, Set<Integer> doctorIds) {
        /*Set<Doctor> doctors = new HashSet<>();
        for (Integer doctorId : doctorIds) {
            Doctor doctor = doctorService.getDoctorById(doctorId);
            if (doctor != null) {
                doctors.add(doctor);
            }
        }*/
        Set<Doctor> doctors = doctorIds.stream().
                map(id -> doctorService.getDoctorById(id)).
                collect(Collectors.toSet());

        patient.setAssignedDoctors(doctors);
        patientRepository.save(patient);
    }

    @Override
    public Patient getPatientById(Integer id) {
        return patientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Patient> getAllPatients() {
        patientRepository.findAll().forEach(patient -> patient.getAssignedDoctors().size());
        return patientRepository.findAll();
    }

    @Override
    public void updatePatient(Integer id, Patient updatedPatient) {
        Patient existingPatient = patientRepository.findById(id).orElse(null);
        if (existingPatient != null) {
            existingPatient.setName(updatedPatient.getName());
            existingPatient.setAge(updatedPatient.getAge());
            existingPatient.setTestType(updatedPatient.getTestType());
            existingPatient.setReportStatus(updatedPatient.isReportStatus());
            existingPatient.setAssignedDoctors(updatedPatient.getAssignedDoctors());
            patientRepository.save(existingPatient);
        }
    }

    @Override
    public void deletePatientById(Integer id) {
        patientRepository.deleteById(id);
    }
}
