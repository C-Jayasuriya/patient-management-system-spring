package com.efutures.Patient;

import com.efutures.Doctor.Doctor;
import com.efutures.TestType.TestType;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Patient {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )

    @Column(
            name = "patient_id",
            updatable = false
    )
    private int id;
    @Column(
            name = "patient_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;
    @Column(
            name = "age",
            nullable = false
    )
    private int age;
    @Column(
            name = "Test_Type",
            nullable = false
    )
    private TestType testType;

    @Column(
            name = "Report_Status",
            nullable = false
    )
    private boolean reportStatus = false;

    @ManyToMany
    @JoinTable(name = "patient_doctor",
            joinColumns = @JoinColumn(name = "patient_id"),
            inverseJoinColumns = @JoinColumn(name = "doctor_id"))
    @Column(
            nullable = false
    )
    private Set<Doctor> assignedDoctors = new HashSet<>();

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TestType getTestType() {
        return testType;
    }

    public void setTestType(TestType testType) {
        this.testType = testType;
    }

    public boolean isReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(boolean reportStatus) {
        this.reportStatus = reportStatus;
    }

    public Set<Doctor> getAssignedDoctors() {
        return assignedDoctors;
    }

    public void setAssignedDoctors(Set<Doctor> assignedDoctors) {
        this.assignedDoctors = assignedDoctors;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", testType=" + testType +
                ", reportStatus=" + reportStatus +
                ", assignedDoctors=" + assignedDoctors +
                '}';
    }
}