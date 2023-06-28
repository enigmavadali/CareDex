package hca.aggreate.api.service;
import hca.aggreate.api.bean.AggregateData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CloudInteractionService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${cloud.url}")
    private String cloudURL;

    public ResponseEntity sendAggregateData(AggregateData aggregateData) {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<AggregateData> requestEntity = new HttpEntity<>(aggregateData, headers);
        return restTemplate.exchange(cloudURL+"/saveAggregateData", HttpMethod.POST, requestEntity, String.class);
    }

    public AggregateData getAggregateDataForFacility(int facilityId){
        return this.restTemplate.getForObject(cloudURL+"/getAggData/"+facilityId,AggregateData.class);
    }
}
