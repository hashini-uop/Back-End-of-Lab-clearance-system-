package com.system.labClearanceSystem.repository;

import com.system.labClearanceSystem.entity.Lab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LabRepository extends JpaRepository<Lab,Integer> {
    @Query(value = "SELECT * FROM LAB WHERE l_id=?1" , nativeQuery = true)
    Lab getLabByLabID(int labID);


    @Query(value = "SELECT * FROM LAB WHERE l_id=?1 and l_type=?2" , nativeQuery = true)
    Lab getLabByLabIDANDLabType(int labID , String labType);



    //if update query use @modifying



}
