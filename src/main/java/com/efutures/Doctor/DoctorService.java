package com.efutures.Doctor;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository; // Dependency Injection

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public void addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    public Doctor getDoctorById(Integer id) {
        return doctorRepository.findById(id).orElse(null);
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Transactional
    public void updateDoctor(Integer id, Doctor updatedDoctor) {
        Doctor existingDoctor = doctorRepository.findById(id).orElse(null);
        if (existingDoctor != null) {
            existingDoctor.setName(updatedDoctor.getName());
            existingDoctor.setSpeciality(updatedDoctor.getSpeciality());
            doctorRepository.save(existingDoctor);
        }
    }

    public void deleteDoctorById(Integer id) {
        doctorRepository.deleteById(id);
    }
}
