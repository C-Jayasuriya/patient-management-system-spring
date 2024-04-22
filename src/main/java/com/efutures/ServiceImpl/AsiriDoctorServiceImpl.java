package com.efutures.ServiceImpl;

import com.efutures.Repository.DoctorRepository;
import com.efutures.Entity.Doctor;
import com.efutures.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Profile(value = "qa")
public class AsiriDoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorRepository doctorRepository; // Dependency Injection
    @Override
    public void log(){
        System.out.println("Inside AsiriDoctorServiceImpl");
    }
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
