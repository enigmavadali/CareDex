package org.hca.aws.CloudManager.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfiguration {

    @Value("${aggregation.api.host}")
    private String aggHost;

    @Bean
    RestTemplate aggRestTemplate(){
        return new RestTemplate();
    }
}
