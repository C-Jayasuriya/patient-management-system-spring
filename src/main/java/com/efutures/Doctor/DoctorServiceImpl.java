package com.efutures.Doctor;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService{
    @Autowired
    private DoctorRepository doctorRepository; // Dependency Injection


    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public void addDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    @Override
    public Doctor getDoctorById(Integer id) {
        return doctorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }


    @Override
    public void updateDoctor(Integer id, Doctor updatedDoctor) {
        Doctor existingDoctor = doctorRepository.findById(id).orElse(null);
        if (existingDoctor != null) {
            existingDoctor.setName(updatedDoctor.getName());
            existingDoctor.setSpeciality(updatedDoctor.getSpeciality());
            existingDoctor.setEmergencyContact(updatedDoctor.getEmergencyContact());
            doctorRepository.save(existingDoctor);
        }
    }

    @Override
    public void deleteDoctorById(Integer id) {
        doctorRepository.deleteById(id);
    }
}
