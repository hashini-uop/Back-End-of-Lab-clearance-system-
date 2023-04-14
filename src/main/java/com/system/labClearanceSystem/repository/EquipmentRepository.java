package com.system.labClearanceSystem.repository;


import com.system.labClearanceSystem.entity.Equipment;
import com.system.labClearanceSystem.entity.Lab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment,Integer> {
    @Query(value = "SELECT e_price FROM Equipment WHERE e_id=?1 " , nativeQuery = true)
    int getPriceByEquName(Integer equipment_id);

    @Query(value = "SELECT * FROM Equipment WHERE "
            + "MATCH(name, description)"
            +"AGAINST(?1)" , nativeQuery = true)
    public List<Equipment> search(String keyword);

    //
//    List<Equipment> search(String name);






//   Equipment getEquipmentById(int equipment_id);

//    Equipment updateEquipmentById(int e_id);

    //code java



}
