package org.hca.aws.CloudManager.controller;

import org.hca.aws.CloudManager.model.AggregateData;
import org.hca.aws.CloudManager.service.CloudAggService;
import org.hca.aws.CloudManager.service.CloudFileService;
import org.hca.aws.CloudManager.service.CloudResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudManagerController {

    @Autowired
    private CloudResidentService cloudResidentService;

    @Autowired
    private CloudAggService cloudAggService;

    @Autowired
    private CloudFileService cloudFileService;

    @GetMapping("/ping")
    public String ping(){
        return "CloudManager is up and running";
    }

    @PostMapping("/transferData")
    public String transfer(){
        return this.cloudResidentService.migrateData();
    }

    @PostMapping("/saveAggregateData")
    public String storeAggData(@RequestBody AggregateData data){
        System.out.println("received call to store agg");
        return this.cloudAggService.saveAggData(data);
    }

    @PostMapping("/getBackupFile")
    public ResponseEntity<String> getSqlFile() {
        return this.cloudFileService.downloadSqlFile();
    }
}


