package org.hca.aws.CloudManager.service;

import org.hca.aws.CloudManager.dao.CloudResidentDAO;
import org.hca.aws.CloudManager.model.Resident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CloudResidentService {

    @Value("${aggregation.api.host}")
    private String aggHost;

    @Autowired
    private RestTemplate aggRestTemplate;

    @Autowired
    private CloudResidentDAO cloudResidentDAO;

    public String migrateData(){
        List<Resident> residents1 = Arrays.asList(this.aggRestTemplate.getForObject(aggHost+"/getResidents/1",Resident[].class));
        this.cloudResidentDAO.insertDataIntoFacility1(residents1);
        List<Resident> residents2 = Arrays.asList(this.aggRestTemplate.getForObject(aggHost+"/getResidents/2",Resident[].class));
        this.cloudResidentDAO.insertDataIntoFacility2(residents2);
        return "migration successful";
    }

}
