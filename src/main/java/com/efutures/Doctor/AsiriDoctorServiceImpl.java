package com.efutures.Doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AsiriDoctorServiceImpl implements DoctorService{
    @Autowired
    private DoctorRepository doctorRepository; // Dependency Injection
    @Override
    public void addDoctor(Doctor doctor) {

    }

    @Override
    public Doctor getDoctorById(Integer id) {
        return null;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return null;
    }

    @Override
    public void updateDoctor(Integer id, Doctor updatedDoctor) {

    }

    @Override
    public void deleteDoctorById(Integer id) {

    }
}
