package com.efutures.Entity;

import com.efutures.Entity.Patient;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(
            name = "doctor_id",
            updatable = false
    )
    private int id;
    @Column(
            name = "doctor_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;

    @Column(
            name = "doctor_emergencyContact",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String emergencyContact;
    @Column(
            name = "doctor_speciality",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String speciality;
    @ManyToMany
    private Set<Patient> assignedPatients = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Set<Patient> getAssignedPatients() {
        return assignedPatients;
    }

    public void setAssignedPatients(Set<Patient> assignedPatients) {
        this.assignedPatients = assignedPatients;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emergencyContact='" + emergencyContact + '\'' +
                ", speciality='" + speciality + '\'' +
                ", assignedPatients=" + assignedPatients +
                '}';
    }
}