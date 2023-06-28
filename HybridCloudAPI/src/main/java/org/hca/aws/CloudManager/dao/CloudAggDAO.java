package org.hca.aws.CloudManager.dao;

import com.developer.keystone.domain.DynamicFacilityData;
import org.hca.aws.CloudManager.model.AggregateData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CloudAggDAO {

    @Autowired
    private JdbcTemplate aggJDBCTemplate;

    private static final String insertAggData = "INSERT INTO aggregation values (?,?,?,?,?,?,?,?,?)";

    public String insertIntoAgg(AggregateData data){
        this.aggJDBCTemplate.update(insertAggData,
                data.getFid(),
                data.getPets(),
                data.getAmbulatory(),
                data.getCannotcommunicate(),
                data.getCovidvaccinated(),
                data.getFallrisk(),
                data.getWanderrisk(),
                data.getElopementrisk(),
                data.getTotalpatients());
        return "insert successful";
    }

    public void insertDynamicData(DynamicFacilityData data){
        int success = aggJDBCTemplate.update("insert into environment values (?,?,?,?,?,?,?)", data.getFid(),data.getTemperature(),data.getHumidity(),
                data.getSo2level(), data.getTrafficJam(),data.getInspectTime(),data.getO2level());
    }
}
