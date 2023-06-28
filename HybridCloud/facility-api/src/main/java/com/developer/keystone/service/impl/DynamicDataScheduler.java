package com.developer.keystone.service.impl;

import com.developer.keystone.domain.DynamicFacilityData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class DynamicDataScheduler {

    static boolean runScheduler = false;

    @Autowired
    private Environment environment;

    @Autowired
    MQSender mqSender;

    @Scheduled(fixedRate = 10000)
    public void modifyDynamicData(){
        String id = environment.getProperty("FACILITY_ID");
        if(runScheduler){
            System.out.println("Running scheduler for facility " + id );
            DynamicFacilityData data = new DynamicFacilityData();
            data.setFid(Integer.parseInt(id));
            data.setTemperature(genSmallValues(60));
            data.setHumidity(genSmallValues(70));
            data.setSo2level(genSmallValues(10));
            data.setO2level(genSmallValues(93));
            data.setTrafficJam(genSmallValues(65));
            data.setInspectTime(new Timestamp(System.currentTimeMillis()));
            this.mqSender.sendMessage(data);
        }
    }

    public void stopScheduler(){
        runScheduler = false;
    }

    public void startScheduler(){
        runScheduler = true;
    }

    private int genSmallValues(int value){
        return value + ThreadLocalRandom.current().nextInt(2, 5);
    }
}

