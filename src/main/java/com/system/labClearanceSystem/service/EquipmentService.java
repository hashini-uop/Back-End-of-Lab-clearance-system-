package com.system.labClearanceSystem.service;

import com.system.labClearanceSystem.entity.Equipment;
import com.system.labClearanceSystem.entity.Lab;


import java.util.List;

public interface EquipmentService {
    public Equipment saveEquipment(Equipment equipment);
    public List<Equipment> getAllEquipment();

    public int getPriceByEquName(Integer equipment_id );


    public Equipment getByID(Integer id);
    public void delete(Integer id);

    public List<Equipment> search(String keyword);


}
