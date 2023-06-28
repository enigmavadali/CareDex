package hca.aggreate.api.controller;
import hca.aggreate.api.bean.Resident;
import hca.aggreate.api.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class ResidentController {

    @Autowired
    ResidentService residentService;

    @GetMapping("/getResidents/{id}")
    public List<Resident> getAllResidents(@PathVariable String id) {
        try{
            return residentService.getResidentDataFromFacility(Integer.parseInt(id));
        } catch(HttpClientErrorException e){
            e.printStackTrace();
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Bad Request", e);
        } catch(Exception e){
            e.printStackTrace();
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", e);
        }
    }

    @GetMapping("/ping")
    public String ping(){
        return "Aggregation api running";
    }

    @PutMapping("/updateResident/{fid}")
    public String updateResident(@RequestBody Resident resident, @PathVariable String fid){
        this.residentService.updateResidentInCloud(resident,Integer.parseInt(fid));
        return "update successful";
    }

}
