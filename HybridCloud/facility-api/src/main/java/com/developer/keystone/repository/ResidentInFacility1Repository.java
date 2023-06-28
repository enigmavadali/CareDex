package com.developer.keystone.repository;

import com.developer.keystone.entity.Resident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentInFacility1Repository extends JpaRepository<Resident, Integer> {

}
