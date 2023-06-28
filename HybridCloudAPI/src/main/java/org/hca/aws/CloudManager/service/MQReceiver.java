package org.hca.aws.CloudManager.service;

import com.developer.keystone.domain.DynamicFacilityData;
import org.hca.aws.CloudManager.dao.CloudAggDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MQReceiver {

    @Autowired
    private CloudAggDAO cloudAggDAO;

    public void receiveMessage(DynamicFacilityData dynamicFacilityData){
        System.out.println("inserting dynamic data from f"+dynamicFacilityData.getFid());
        this.cloudAggDAO.insertDynamicData(dynamicFacilityData);
    }
}
