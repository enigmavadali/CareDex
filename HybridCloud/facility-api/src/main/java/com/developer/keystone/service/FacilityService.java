package com.developer.keystone.service;

import com.developer.keystone.domain.Facility1Data;
import com.developer.keystone.entity.Facilities;
import com.developer.keystone.entity.Facility1;
import com.developer.keystone.entity.FacilityData;

import java.util.List;

public interface FacilityService {
    List<FacilityData> getFacilityData();
    String updatePatientInFacility(Facility1Data data);

    String updateFacilitiesData(Facilities data);
}
