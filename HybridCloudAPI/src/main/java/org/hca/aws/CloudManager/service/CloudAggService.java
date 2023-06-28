package org.hca.aws.CloudManager.service;

import org.hca.aws.CloudManager.dao.CloudAggDAO;
import org.hca.aws.CloudManager.model.AggregateData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CloudAggService {

    @Autowired
    private CloudAggDAO cloudAggDAO;

    public String saveAggData(AggregateData data){
        return this.cloudAggDAO.insertIntoAgg(data);
    }
}
