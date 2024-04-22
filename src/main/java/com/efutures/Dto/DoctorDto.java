package com.efutures.Dto;

import com.efutures.Entity.Patient;

import java.util.HashSet;
import java.util.Set;

public class DoctorDto {
    private String name;
    private String emergencyContact;
    private String speciality;
    private Set<Patient> assignedPatients = new HashSet<>();

    public DoctorDto() {
    }

    public DoctorDto(String name, String emergencyContact, String speciality) {
        this.name = name;
        this.emergencyContact = emergencyContact;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getSpeciality() {
        return speciality;
    }

    public Set<Patient> getAssignedPatients() {
        return assignedPatients;
    }

    public void setAssignedPatients(Set<Patient> assignedPatients) {
        this.assignedPatients = assignedPatients;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
