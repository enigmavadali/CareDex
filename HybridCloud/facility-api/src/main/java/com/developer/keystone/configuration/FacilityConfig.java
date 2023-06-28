package com.developer.keystone.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class FacilityConfig {

    @Bean("aggregateRestTemplate")
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
