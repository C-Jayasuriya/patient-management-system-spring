package com.efutures.Controller;

import com.efutures.Service.DoctorService;
import com.efutures.Dto.DoctorDto;
import com.efutures.Entity.Doctor;
import com.efutures.Util.DoctorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {
    //@Qualifier("doctorServiceImpl") Have used profiling here
    @Autowired
    DoctorService doctorService;

    @Autowired
    DoctorUtil doctorUtil;

    @GetMapping("/logDoctor")
    void logProfile(){
        doctorService.log();
    }
    @PostMapping("/doctor")
    public void saveDoctor(@RequestBody DoctorDto doctorDto) {
        Doctor convertedDoctor = doctorUtil.convert(doctorDto);
        doctorService.addDoctor(convertedDoctor);
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

