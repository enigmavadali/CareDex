package com.developer.keystone.entity;

import jakarta.persistence.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
@Table(name = "facilities")
public class Facilities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "facility_id")
    private Long facilityId;

    @Column(name = "total_capacity")
    private Integer totalCapacity;

    @Column(name = "current_occupancy")
    private Integer currentOccupancy;

    @Column(name = "num_wheelchair_available")
    private Integer numWheelchairAvailable;

    public Facilities() {
        // Default constructor required by JPA
    }

    public Facilities(Integer totalCapacity, Integer currentOccupancy, Integer numWheelchairAvailable) {
        this.totalCapacity = totalCapacity;
        this.currentOccupancy = currentOccupancy;
        this.numWheelchairAvailable = numWheelchairAvailable;
    }

    // Getters and setters
    public Long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public Integer getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public Integer getCurrentOccupancy() {
        return currentOccupancy;
    }

    public void setCurrentOccupancy(Integer currentOccupancy) {
        this.currentOccupancy = currentOccupancy;
    }

    public Integer getNumWheelchairAvailable() {
        return numWheelchairAvailable;
    }

    public void setNumWheelchairAvailable(Integer numWheelchairAvailable) {
        this.numWheelchairAvailable = numWheelchairAvailable;
    }
}

