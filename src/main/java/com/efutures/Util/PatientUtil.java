package com.efutures.Util;
import com.efutures.Entity.Patient;
import com.efutures.Dto.PatientDto;

public interface PatientUtil {
    public Patient convert(PatientDto patientDto);
}
