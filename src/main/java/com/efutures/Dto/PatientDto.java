package com.efutures.Dto;
import com.efutures.Entity.Doctor;
import com.efutures.Enum.TestType;

import java.util.HashSet;
import java.util.Set;


public class PatientDto {
    private String name;
    private int age;
    private TestType testType;
    private boolean reportStatus = false;
    private Set<Integer> assignedDoctors = new HashSet<>();

    public PatientDto() {
    }

    public PatientDto(String name, int age, TestType testType, boolean reportStatus, Set<Integer> assignedDoctors) {
        this.name = name;
        this.age = age;
        this.testType = testType;
        this.reportStatus = reportStatus;
        this.assignedDoctors = assignedDoctors;
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

    public Set<Integer> getAssignedDoctors() {
        return assignedDoctors;
    }

    public void setAssignedDoctors(Set<Integer> assignedDoctors) {
        this.assignedDoctors = assignedDoctors;
    }

    @Override
    public String toString() {
        return "PatientDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", testType=" + testType +
                ", reportStatus=" + reportStatus +
                ", assignedDoctors=" + assignedDoctors +
                '}';
    }
}
