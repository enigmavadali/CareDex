package com.developer.keystone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Facility2")
public class Facility2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private Integer pId;

    @Column(name = "p_name")
    private String pName;

    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private LocalDate dob;

    @Column(name = "gender")
    private String gender;

    @Column(name = "discharge_date")
    @Temporal(TemporalType.DATE)
    private LocalDate dischargeDate;

    @Column(name = "risk_factor")
    private String riskFactor;

    @Column(name = "mobility_status")
    private String mobilityStatus;

    @Column(name = "specific_illness")
    private String specificIllness;

    @Column(name = "special_needs")
    private String specialNeeds;

    public Facility2() {}

    public Facility2(Integer pId, String pName, LocalDate dob, String gender, LocalDate dischargeDate, String riskFactor,
                     String mobilityStatus, String specificIllness, String specialNeeds) {
        this.pId = pId;
        this.pName = pName;
        this.dob = dob;
        this.gender = gender;
        this.dischargeDate = dischargeDate;
        this.riskFactor = riskFactor;
        this.mobilityStatus = mobilityStatus;
        this.specificIllness = specificIllness;
        this.specialNeeds = specialNeeds;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
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

    public LocalDate getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(LocalDate dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(String riskFactor) {
        this.riskFactor = riskFactor;
    }

    public String getMobilityStatus() {
        return mobilityStatus;
    }

    public void setMobilityStatus(String mobilityStatus) {
        this.mobilityStatus = mobilityStatus;
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
