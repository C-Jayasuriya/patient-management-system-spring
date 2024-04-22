package com.efutures.UtilImpl;

import com.efutures.Entity.Patient;
import com.efutures.Dto.PatientDto;
import com.efutures.Util.PatientUtil;
import org.springframework.stereotype.Component;

@Component
public class PatientUtilImpl implements PatientUtil {
    public Patient convert(PatientDto patientDto){
        Patient patient = new Patient();
        patient.setName(patientDto.getName());
        patient.setAge(patientDto.getAge());
        patient.setTestType(patientDto.getTestType());
        patient.setReportStatus(patientDto.isReportStatus());
        return patient;
    }
}
