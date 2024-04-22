package com.efutures.Service;

import com.efutures.Entity.Doctor;

import java.util.List;

public interface DoctorService {
    public void log();
    public void addDoctor(Doctor doctor);
    public Doctor getDoctorById(Integer id);
    public List<Doctor> getAllDoctors();
    public void updateDoctor(Integer id, Doctor updatedDoctor);
    public void deleteDoctorById(Integer id);
}
