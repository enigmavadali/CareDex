package com.developer.keystone.controller;

import com.developer.keystone.domain.DynamicFacilityData;
import com.developer.keystone.domain.Facility1Data;
import com.developer.keystone.entity.Facilities;
import com.developer.keystone.entity.FacilityData;
import com.developer.keystone.entity.Resident;
import com.developer.keystone.service.MyService;
import com.developer.keystone.service.impl.DynamicDataScheduler;
import com.developer.keystone.service.impl.FacilityServiceImpl;
import com.developer.keystone.service.impl.MQSender;
import com.developer.keystone.service.impl.ResidentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping
public class FacilityDataController {
    @Autowired
    private FacilityServiceImpl facilityServiceImpl;

    @Autowired
    private ResidentServiceImpl residentServiceImpl;

    @Autowired
    private Environment environment;

    @Autowired
    private MyService myService;

    @Autowired
    private MQSender mqSender;

    @Autowired
    private DynamicDataScheduler dynamicDataScheduler;

    @Value("${spring.datasource.url}")
    private String url;

    @GetMapping("/create")
    public ResponseEntity<String> createSnapshot() {
        myService.createSnapshot();
        return ResponseEntity.ok("Snapshot created successfully");
    }

    @GetMapping("/getAllData")
    public List<FacilityData> getAllFacilityData() {
        return facilityServiceImpl.getFacilityData();
    }

    @GetMapping("/getAllResidents")
    public List<Resident> getAllResidentData() {
        System.out.println("URLLLLLLLLLL: " + url);
        return residentServiceImpl.getAllResidents();
    }

    @PutMapping("updatePatientRecord")
    public String updatePatient(@RequestBody Facility1Data data){
        return this.facilityServiceImpl.updatePatientInFacility(data);
    }

    @PutMapping("updateFacilityData")
    public String updateFacilitiesData(@RequestBody Facilities data){
        return this.facilityServiceImpl.updateFacilitiesData(data);
    }

    @PostMapping("/sendQueue")
    public String pushToQueue(@RequestBody DynamicFacilityData data){
        this.mqSender.sendMessage(data);
        return "posted";
    }

    @GetMapping("/ping")
    public String ping(){
        return "Facility " + environment.getProperty("FACILITY_ID") + " up and running";
    }

    @PostMapping("/stopScheduler")
    public void stop(){
        dynamicDataScheduler.stopScheduler();
    }

    @PostMapping("/startScheduler")
    public void start(){
        dynamicDataScheduler.startScheduler();
    }

    @PutMapping("/updateResident")
    public String updateResident(@RequestBody Resident resident){
        return this.residentServiceImpl.updateResident(resident);
    }

    @GetMapping("/sql-file")
    public ResponseEntity<Resource> getSqlFile() throws IOException {
        // change path to local file path (fully qualified)
        File sqlFile = new File("/Users/niveditamishra/Downloads/keystone/facility1.sql");

        if (!sqlFile.exists()) {
            // Handle the case where the SQL file does not exist
            return ResponseEntity.notFound().build();
        }

        FileSystemResource resource = new FileSystemResource(sqlFile);
        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=script.sql")
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(resource);
    }


}

