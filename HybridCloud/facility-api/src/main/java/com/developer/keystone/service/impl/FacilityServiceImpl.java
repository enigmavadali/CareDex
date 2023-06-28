package com.developer.keystone.service.impl;

import com.developer.keystone.domain.Facility1Data;
import com.developer.keystone.entity.*;
import com.developer.keystone.repository.FacilitiesRepository;
import com.developer.keystone.repository.Facility1Repository;
import com.developer.keystone.repository.Facility2Repository;
import com.developer.keystone.repository.FacilityDataRepository;
import com.developer.keystone.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class FacilityServiceImpl implements FacilityService {
    @Autowired
    private FacilityDataRepository facilityDataRepository;

    @Autowired
    private Facility1Repository facility1Repository;

    @Autowired
    private Facility2Repository facility2Repository;

    @Autowired
    private FacilitiesRepository facilitiesRepository;

    @Autowired
    @Qualifier("aggregateRestTemplate")
    private RestTemplate restTemplate;

    @Override
    public List<FacilityData> getFacilityData() {
        return facilityDataRepository.getFacilityData();
    }

    @Override
    public String updatePatientInFacility(Facility1Data data) {
        if (data.getFacilityId() == 1) {
            this.facility1Repository.save(getFacility1FromFacilityData(data));
        } else if (data.getFacilityId() == 2) {
            this.facility2Repository.save(getFacility2FromFacilityData(data));
        }
        // call adi rest api with data obj
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
//        JSONObject req = new JSONObject(data);
//        req.remove("id");
        HttpEntity<Facility1Data> request = new HttpEntity<>(data, headers);
        System.out.println(data.toString());

        ResponseEntity<String> response = this.restTemplate.exchange("http://10.8.23.40:8080/patient/update", HttpMethod.PUT, request, String.class);
        if (response.getStatusCode() == HttpStatus.OK && "Update Successful".equalsIgnoreCase(response.getBody())) {
            return "Update successful";
        } else {
            return "Update Failed";
        }
    }

    private Facility1 getFacility1FromFacilityData(Facility1Data data) {
        Optional<Facility1> fac = this.facility1Repository.findById(data.getPatientId());
        Facility1 fac1 = null;
        if (fac.isPresent()) {
            fac1 = fac.get();
            fac1.setPatientName(data.getPatientName());
            fac1.setDob(LocalDate.parse(data.getDob()));
            fac1.setGender(data.getGender());
            fac1.setSpecialNeeds(data.getSpecialNeeds());
            fac1.setSpecificIllness(data.getSpecificIllness());
        }
        return fac1;
    }
//    private Resident getResidentInFacility1(ResidentInFacility1 data) {
//        List<ResidentInFacility1> fac = this.facility1Repository.findAll();
//        Facility1 fac1 = null;
//        if (fac.isPresent()) {
//            fac1 = fac.get();
//            fac1.setPatientName(data.getPatientName());
//            fac1.setDob(LocalDate.parse(data.getDob()));
//            fac1.setGender(data.getGender());
//            fac1.setSpecialNeeds(data.getSpecialNeeds());
//            fac1.setSpecificIllness(data.getSpecificIllness());
//        }
//        return fac1;
//    }

    private Facility2 getFacility2FromFacilityData(Facility1Data data) {
        Optional<Facility2> fac = this.facility2Repository.findById(data.getPatientId());
        Facility2 fac2 = null;
        if (fac.isPresent()) {
            fac2 = fac.get();
            fac2.setPName(data.getPatientName());
            fac2.setDob(LocalDate.parse(data.getDob()));
            fac2.setGender(data.getGender());
            fac2.setDischargeDate(LocalDate.parse(data.getDischargeDate()));
            fac2.setSpecialNeeds(data.getSpecialNeeds());
            fac2.setMobilityStatus(data.getMobilityStatus());
            fac2.setSpecificIllness(data.getSpecificIllness());
        }
        return fac2;
    }

    @Override
    public String updateFacilitiesData(Facilities data) {
        Optional<Facilities> facilities = this.facilitiesRepository.findById(data.getFacilityId());
        Facilities fac = null;
        if (facilities.isPresent()) {
            fac = facilities.get();
            fac.setTotalCapacity(data.getTotalCapacity());
            fac.setCurrentOccupancy(data.getCurrentOccupancy());
            fac.setNumWheelchairAvailable(data.getNumWheelchairAvailable());
        }
        this.facilitiesRepository.save(fac);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Facilities> request = new HttpEntity<>(data, headers);
        ResponseEntity<String> response = this.restTemplate.exchange("/", HttpMethod.PUT, request, String.class);
        if (response.getStatusCode() == HttpStatus.OK && "Update Successful".equalsIgnoreCase(response.getBody())) {
            return "Update successful";
        } else {
            return "Update Failed";
        }
    }


}
