package com.developer.keystone.repository;

import com.developer.keystone.entity.FacilityData;
import com.developer.keystone.entity.FacilityDataId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacilityDataRepository extends JpaRepository<FacilityData, FacilityDataId> {
    @Query(value = "SELECT   1 as facility_id, patient_id AS patient_id, patient_name, dob, gender, specific_illness, special_needs, NULL AS discharge_date, NULL AS risk_factor, NULL AS mobility_status FROM Facility1 UNION SELECT   2 as facility_id, p_id AS patient_id,p_name AS patient_name, dob, gender, specific_illness, special_needs, discharge_date, risk_factor, mobility_status FROM Facility2", nativeQuery = true)
//@Query(value = "SELECT new com.example.demo.FacilityData(" +
//        "CASE WHEN f1.patientId IS NOT NULL THEN 1 ELSE 2 END, " +
//        "COALESCE(f1.patientId, f2.pId), " +
//        "COALESCE(f1.patientName, f2.pName), " +
//        "COALESCE(f1.dob, f2.dob), " +
//        "COALESCE(f1.gender, f2.gender), " +
//        "COALESCE(f1.specificIllness, f2.specificIllness), " +
//        "COALESCE(f1.specialNeeds, f2.specialNeeds), " +
//        "f2.riskFactor, " +
//        "f2.dischargeDate, " +
//        "f2.mobilityStatus" +
//        ") " +
//        "FROM Facility1 f1 FULL OUTER JOIN Facility2 f2 ON f1.patientId = f2.pId",
//        nativeQuery = true)
    List<FacilityData> getFacilityData();
}
