package com.developer.keystone.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class FacilityDataId implements Serializable {

    private Long facilityId;
    private Long patientId;

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
// getters and setters
}

