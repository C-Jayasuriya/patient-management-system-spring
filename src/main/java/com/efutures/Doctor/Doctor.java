package com.efutures.Doctor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private int id;
    private String name;
    private String emergencyContact;
    private String speciality;


    public String getSpecialization() {
        return speciality;
    }

    public String getEmergencyContact(){
        return emergencyContact;
    }
    public int getId() {
        return id ;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "\nDoctor ID: " + getId() +
                ", Name: " + getName() +
                ", Speciality: " + getSpecialization() +
                ", Emergency Contact Number: " + getEmergencyContact() ;
    }
}