package org.hca.aws.CloudManager.dao;

import org.hca.aws.CloudManager.model.Resident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Service
public class CloudResidentDAO {

    @Autowired
    private JdbcTemplate facility1JDBCTemplate;

    @Autowired
    private JdbcTemplate facility2JDBCTemplate;

    private static final String insertResident = "INSERT INTO RESIDENT VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public void insertDataIntoFacility1(List<Resident> residents){
        facility1JDBCTemplate.batchUpdate(insertResident, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                Resident res = residents.get(i);
                ps.setInt(1,res.getPid());
                ps.setString(2,res.getFirstName());
                ps.setString(3,res.getLastName());
                ps.setInt(4,res.getRoom()!=null?res.getRoom():0);
                ps.setString(5,res.getGender());
                ps.setInt(6,res.getAge());
                ps.setDate(7,res.getDob());
                ps.setString(8,res.getTelephone());
                ps.setString(9,res.getHasPet());
                ps.setInt(10,res.getWeightLbs());
                ps.setString(11,res.getPhoto());
                ps.setString(12,res.getEmergencyContact1());
                ps.setString(13,res.getTelephoneEmc1());
                ps.setString(14,res.getRelationshipEmc1());
                ps.setString(15,res.getEmergencyContact2());
                ps.setString(16,res.getTelephoneEmc2());
                ps.setString(17,res.getRelationshipEmc2());
                ps.setString(18,res.getIsAmbulatory());
                ps.setString(19,res.getIsAbleToCommunicate());
                ps.setString(20,res.getMedicalInformation());
                ps.setString(21,res.getIsVaccinatedForCovid19());
                ps.setDate(22,res.getLastFall());
                ps.setDate(23,res.getLastErVisit());
                ps.setString(24,res.getDischargedFromOvernightHospitalStay());
                ps.setString(25,res.getIsFallRisk());
                ps.setString(26,res.getIsWanderRisk());
                ps.setString(27,res.getIsElopementRisk());
                ps.setString(28,res.getPhysician());
                ps.setString(29,res.getPhysicianTelephone());
                ps.setString(30,res.getIsPet());
            }

            @Override
            public int getBatchSize() {
                return residents.size();
            }
        });
    }

    public String insertDataIntoFacility2(List<Resident> residents){
        facility2JDBCTemplate.batchUpdate(insertResident, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                Resident res = residents.get(i);
                ps.setInt(1,res.getPid());
                ps.setString(2,res.getFirstName());
                ps.setString(3,res.getLastName());
                ps.setInt(4,res.getRoom()!=null?res.getRoom():0);
                ps.setString(5,res.getGender());
                ps.setInt(6,res.getAge());
                ps.setDate(7,res.getDob());
                ps.setString(8,res.getTelephone());
                ps.setString(9,res.getHasPet());
                ps.setInt(10,res.getWeightLbs());
                ps.setString(11,res.getPhoto());
                ps.setString(12,res.getEmergencyContact1());
                ps.setString(13,res.getTelephoneEmc1());
                ps.setString(14,res.getRelationshipEmc1());
                ps.setString(15,res.getEmergencyContact2());
                ps.setString(16,res.getTelephoneEmc2());
                ps.setString(17,res.getRelationshipEmc2());
                ps.setString(18,res.getIsAmbulatory());
                ps.setString(19,res.getIsAbleToCommunicate());
                ps.setString(20,res.getMedicalInformation());
                ps.setString(21,res.getIsVaccinatedForCovid19());
                ps.setDate(22,res.getLastFall());
                ps.setDate(23,res.getLastErVisit());
                ps.setString(24,res.getDischargedFromOvernightHospitalStay());
                ps.setString(25,res.getIsFallRisk());
                ps.setString(26,res.getIsWanderRisk());
                ps.setString(27,res.getIsElopementRisk());
                ps.setString(28,res.getPhysician());
                ps.setString(29,res.getPhysicianTelephone());
                ps.setString(30,res.getIsPet());
            }

            @Override
            public int getBatchSize() {
                return residents.size();
            }
        });
        return "success";
    }
}
