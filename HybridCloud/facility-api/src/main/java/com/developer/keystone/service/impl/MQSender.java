package com.developer.keystone.service.impl;

import com.developer.keystone.domain.DynamicFacilityData;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MQSender {

    @Autowired
    @Qualifier("rabbitTemplate")
    private AmqpTemplate rabbitTemplate;

    @Autowired
    @Qualifier("queue")
    private Queue queue;

    public void sendMessage(DynamicFacilityData dynamicFacilityData){
        rabbitTemplate.convertAndSend(queue.getName(),dynamicFacilityData);
    }
}
