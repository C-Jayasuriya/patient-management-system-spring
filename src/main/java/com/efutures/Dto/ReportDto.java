package com.efutures.Dto;

import com.efutures.Entity.Doctor;
import com.efutures.Entity.Patient;
import com.efutures.Enum.TestType;

public class ReportDto {
    private TestType testType;
    private Integer issuedDoctor;
    private Integer involvedPatient;
    private String specialNotes;

    public ReportDto() {
    }

    public ReportDto(TestType testType, Integer issuedDoctor, Integer involvedPatient, String specialNotes) {
        this.testType = testType;
        this.issuedDoctor = issuedDoctor;
        this.involvedPatient = involvedPatient;
        this.specialNotes = specialNotes;
    }

    public TestType getTestType() {
        return testType;
    }

    public void setTestType(TestType testType) {
        this.testType = testType;
    }

    public Integer getIssuedDoctor() {
        return issuedDoctor;
    }

    public void setIssuedDoctor(Integer issuedDoctor) {
        this.issuedDoctor = issuedDoctor;
    }

    public Integer getInvolvedPatient() {
        return involvedPatient;
    }

    public void setInvolvedPatient(Integer involvedPatient) {
        this.involvedPatient = involvedPatient;
    }

    public String getSpecialNotes() {
        return specialNotes;
    }

    public void setSpecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
    }

    @Override
    public String toString() {
        return "ReportDto{" +
                "testType=" + testType +
                ", issuedDoctor=" + issuedDoctor +
                ", involvedPatient=" + involvedPatient +
                ", specialNotes='" + specialNotes + '\'' +
                '}';
    }
}

