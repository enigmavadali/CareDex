package com.developer.keystone.service;

import com.developer.keystone.entity.Resident;

import java.util.List;

public interface ResidentService {
    List<Resident> getAllResidents();
    String updateResident(Resident data);
}
