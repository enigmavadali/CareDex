package com.developer.keystone.service.impl;

import com.developer.keystone.entity.Resident;
import com.developer.keystone.repository.ResidentInFacility1Repository;
import com.developer.keystone.service.ResidentService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ResidentServiceImpl implements ResidentService {

    @Autowired
    private ResidentInFacility1Repository residentInFacility1Repository;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    @Qualifier("aggregateRestTemplate")
    private RestTemplate restTemplate;

    @Value("${agg.host}")
    private String aggHost;

    @Autowired
    private Environment environment;

    @Override
    public List<Resident> getAllResidents() {
        List<Resident> residents = this.residentInFacility1Repository.findAll();
        return residents;
    }
    private List<Resident> getResidentInFacility1() {
        List<com.developer.keystone.entity.Resident> list = this.residentInFacility1Repository.findAll();
        List<Resident> residents = new ArrayList<>();
        for(com.developer.keystone.entity.Resident source : list){
            Resident resident = new Resident();
            resident.setPid(source.getPid());
            resident.setFirstName(source.getFirstName());
            resident.setLastName(source.getLastName());
            resident.setGender(source.getGender());
            resident.setAge(source.getAge());
            resident.setHasPet(source.getHasPet());
            resident.setPhoto(source.getPhoto());
            resident.setIsAmbulatory(source.getIsAmbulatory());
            resident.setIsAbleToCommunicate(source.getIsAbleToCommunicate());
            resident.setMedicalInformation(source.getMedicalInformation());
            resident.setIsFallRisk(source.getIsFallRisk());
            resident.setIsWanderRisk(source.getIsWanderRisk());
            resident.setIsElopementRisk(source.getIsElopementRisk());
            residents.add(resident);
        }
        return residents;
    }

    @Override
    public String updateResident(Resident newResident){
        Optional<Resident> opt = this.residentInFacility1Repository.findById(newResident.getPid());
        if(opt.isPresent()){
            Resident existingResident = opt.get();
            this.entityManager.detach(existingResident);
            this.entityManager.merge(newResident);

            this.residentInFacility1Repository.save(newResident);
        }
        else{
            System.out.println("could not find resident");
        }
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Resident> requestEntity = new HttpEntity<>(newResident, headers);
        ResponseEntity<String> resp = this.restTemplate.exchange(aggHost + "/updateResident/"+environment.getProperty("FACILITY_ID"),
                HttpMethod.PUT,requestEntity, String.class);
        if(resp.getStatusCode() == HttpStatus.OK){
            return "update successful";
        }
        else{
            return "update failed";
        }
    }
}
