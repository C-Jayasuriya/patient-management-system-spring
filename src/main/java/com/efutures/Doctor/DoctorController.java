package com.efutures.Doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {
    @Qualifier("doctorServiceImpl")
    @Autowired
    DoctorService doctorService;

    @PostMapping("/doctor")
    public void saveDoctor(@RequestBody Doctor doctor) {
        doctorService.addDoctor(doctor);
    }

    @GetMapping("/doctor/{id}")
    public Doctor getDoctor(@PathVariable("id") Integer id){
        Doctor doctorById = doctorService.getDoctorById(id);
        return doctorById;
    }
    @GetMapping("/doctors")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }
    @PutMapping("/doctor/{id}")
    public void updateDoctor(@PathVariable("id") Integer id, @RequestBody Doctor updatedDoctor) {
        doctorService.updateDoctor(id, updatedDoctor);
    }

    @DeleteMapping("/doctor/{id}")
    public void deleteDoctor(@PathVariable("id") Integer id) {
        doctorService.deleteDoctorById(id);
    }

}

