package com.efutures.Patient;

import com.efutures.Doctor.Doctor;
import com.efutures.TestType.TestType;
import jakarta.persistence.*;

@Entity
public class Patient {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private int id;
    private String name;
    private int age;
    private TestType testType;
    private boolean reportStatus = false;
    @OneToOne
    private Doctor assignedDoctor;

    public Doctor getDAssigedDoctor(){
        return assignedDoctor;
    }

    public int getAge() {
        return age;
    }

    public TestType getTestType() {
        return testType;
    }

    public void setTestType(TestType testType){
        this.testType = testType;

    }

    public String getReportStatus() {
        return reportStatus ? "Collected" : "To be Collected";
    }

    public void setReportStatus(boolean newReportStatus) {
        this.reportStatus = newReportStatus;
    }

    public Doctor getAssignedDoctor() {
        return (assignedDoctor);
    }

    public void setDoctor(Doctor doctor) {
        this.assignedDoctor = doctor;
    }
    public int getId() {
        return id ;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nPatient ID: " + getId() +
                ", Name: " + getName() +
                ", Test Type: " + getTestType() +
                ", Age: " + getAge() +
                ", Report: " + getReportStatus()+
                ", \nAssigned Doctor: " + getAssignedDoctor();
    }
}