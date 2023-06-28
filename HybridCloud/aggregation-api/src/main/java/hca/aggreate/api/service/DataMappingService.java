package hca.aggreate.api.service;

import hca.aggreate.api.bean.AggregateData;
import hca.aggreate.api.bean.Resident;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataMappingService {

    //Creating aggregate data from resident data
    public AggregateData createAggregateDataFromFacilityData(List<Resident> residentList, int facilityId){
        AggregateData aggregatedata = new AggregateData();
        int pets = 0;
        int ambulatory = 0;
        int cannotcommunicate = 0;
        int covidvaccinated = 0;
        int fallrisk = 0;
        int wanderrisk = 0;
        int elopementrisk = 0;
        aggregatedata.setFid(facilityId);
        aggregatedata.setTotalpatients(residentList.size());

        for (Resident resident : residentList) {
            if ("yes".equalsIgnoreCase(resident.getHasPet())) {
                pets++;
            }
            if ("yes".equalsIgnoreCase(resident.getIsAmbulatory())) {
                ambulatory++;
            }
            if ("no".equalsIgnoreCase(resident.getIsAbleToCommunicate())) {
                cannotcommunicate++;
            }
            if ("yes".equalsIgnoreCase(resident.getIsVaccinatedForCovid19())) {
                covidvaccinated++;
            }
            if ("yes".equalsIgnoreCase(resident.getIsFallRisk())) {
                fallrisk++;
            }
            if ("yes".equalsIgnoreCase(resident.getIsWanderRisk())) {
                wanderrisk++;
            }
            if ("yes".equalsIgnoreCase(resident.getIsElopementRisk())) {
                elopementrisk++;
            }
        }

        aggregatedata.setPets(pets);
        aggregatedata.setAmbulatory(ambulatory);
        aggregatedata.setCannotcommunicate(cannotcommunicate);
        aggregatedata.setCovidvaccinated(covidvaccinated);
        aggregatedata.setFallrisk(fallrisk);
        aggregatedata.setWanderrisk(wanderrisk);
        aggregatedata.setElopementrisk(elopementrisk);
        return aggregatedata;
    }
}


