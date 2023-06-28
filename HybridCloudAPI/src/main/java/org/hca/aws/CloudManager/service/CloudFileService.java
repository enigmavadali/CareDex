package org.hca.aws.CloudManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;
import org.springframework.web.client.RestTemplate;

import java.io.FileOutputStream;
import java.util.List;

@Service
public class CloudFileService {

    @Autowired
    private RestTemplate aggRestTemplate;

    public ResponseEntity<String> downloadSqlFile() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_OCTET_STREAM));
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<ByteArrayResource> sqlFileResponse = this.aggRestTemplate.exchange(
                "http://10.8.26.170:8080/sql-file", HttpMethod.GET, entity, ByteArrayResource.class);

        if (sqlFileResponse.getStatusCode() != HttpStatus.OK || sqlFileResponse.getBody() == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to retrieve the SQL file.");
        }

        ByteArrayResource sqlFileResource = sqlFileResponse.getBody();
        String savePath = "/home/ec2-user/backup.sql";

        try (FileOutputStream fos = new FileOutputStream(savePath)) {
            StreamUtils.copy(sqlFileResource.getInputStream(), fos);
        } catch (Exception e){
            return ResponseEntity.internalServerError().body("Cannot save file");
        }
        return ResponseEntity.ok("SQL file downloaded and saved successfully.");
    }
}
