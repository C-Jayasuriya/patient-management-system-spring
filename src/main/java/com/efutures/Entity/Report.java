package com.efutures.Entity;

import com.efutures.Enum.TestType;
import jakarta.persistence.*;

@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "report_id", updatable = false)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "test_type", nullable = false)
    private TestType testType;

    @ManyToOne
    @JoinColumn(name = "issued_doctor_id", nullable = false)
    private Doctor issuedDoctor;

    @ManyToOne
    @JoinColumn(name = "involved_patient_id", nullable = false)
    private Patient involvedPatient;

    @Column(name = "special_notes", columnDefinition = "TEXT")
    private String specialNotes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TestType getTestType() {
        return testType;
    }

    public void setTestType(TestType testType) {
        this.testType = testType;
    }

    public Doctor getIssuedDoctor() {
        return issuedDoctor;
    }

    public void setIssuedDoctor(Doctor issuedDoctor) {
        this.issuedDoctor = issuedDoctor;
    }

    public Patient getInvolvedPatient() {
        return involvedPatient;
    }

    public void setInvolvedPatient(Patient involvedPatient) {
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
        return "Report{" +
                "id=" + id +
                ", testType=" + testType +
                ", issuedDoctor=" + issuedDoctor +
                ", involvedPatient=" + involvedPatient +
                ", specialNotes='" + specialNotes + '\'' +
                '}';
    }
}
