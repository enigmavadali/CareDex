package com.developer.keystone.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Facility1")
public class Facility1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Integer patientId;

    @Column(name = "patient_name")
    private String patientName;

    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private LocalDate dob;

    @Column(name = "gender")
    private String gender;

    @Column(name = "specific_illness")
    private String specificIllness;

    @Column(name = "special_needs")
    private String specialNeeds;

    public Facility1() {
        // no-argument constructor
    }

    public Facility1(Integer patientId, String patientName, LocalDate dob, String gender, String specificIllness, String specialNeeds) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.dob = dob;
        this.gender = gender;
        this.specificIllness = specificIllness;
        this.specialNeeds = specialNeeds;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecificIllness() {
        return specificIllness;
    }

    public void setSpecificIllness(String specificIllness) {
        this.specificIllness = specificIllness;
    }

    public String getSpecialNeeds() {
        return specialNeeds;
    }

    public void setSpecialNeeds(String specialNeeds) {
        this.specialNeeds = specialNeeds;
    }
}
