package com.efutures.UtilImpl;

import com.efutures.Entity.Doctor;
import com.efutures.Dto.DoctorDto;
import com.efutures.Util.DoctorUtil;
import org.springframework.stereotype.Component;

@Component
public class DoctorUtilImpl implements DoctorUtil {
    @Override
    public Doctor convert(DoctorDto doctorDto){
        Doctor doctor = new Doctor();
        doctor.setName(doctorDto.getName());
        doctor.setEmergencyContact(doctorDto.getEmergencyContact());
        doctor.setSpeciality(doctorDto.getSpeciality());
        return doctor;
    }
}
