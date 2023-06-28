package com.developer.keystone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class FacilityData {

    @EmbeddedId
    private FacilityDataId id;
    @Column(insertable=false, updatable=false)
    private Long facilityId;
    @Column(insertable=false, updatable=false)
    private Long patientId;

    private String patientName;
    private LocalDate dob;
    private String gender;
    private String specificIllness;
    private String specialNeeds;
    private String riskFactor;
    private LocalDate dischargeDate;
    private String mobilityStatus;

    public Long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

//    public FacilityDataId getId() {
//        return id;
//    }
//
//    public void setId(FacilityDataId id) {
//        this.id = id;
//    }

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

    public String getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(String riskFactor) {
        this.riskFactor = riskFactor;
    }

    public LocalDate getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(LocalDate dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getMobilityStatus() {
        return mobilityStatus;
    }

    public void setMobilityStatus(String mobilityStatus) {
        this.mobilityStatus = mobilityStatus;
    }

    @Override
    public String toString() {
        return "FacilityData{" +
                "id=" + id +
                ", facilityId=" + facilityId +
                ", patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", specificIllness='" + specificIllness + '\'' +
                ", specialNeeds='" + specialNeeds + '\'' +
                ", riskFactor='" + riskFactor + '\'' +
                ", dischargeDate=" + dischargeDate +
                ", mobilityStatus='" + mobilityStatus + '\'' +
                '}';
    }
}
