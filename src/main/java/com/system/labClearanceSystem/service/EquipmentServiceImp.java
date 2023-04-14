package com.system.labClearanceSystem.service;

import com.system.labClearanceSystem.entity.Equipment;
import com.system.labClearanceSystem.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EquipmentServiceImp implements EquipmentService{
    @Autowired
    private EquipmentRepository equipmentRepository;
    @Override
    public Equipment saveEquipment(Equipment equipment){

        return equipmentRepository.save(equipment);
    }

    @Override
    public int getPriceByEquName(Integer equipment_id ){

        return equipmentRepository.getPriceByEquName(equipment_id);
    }

    @Override
    public List<Equipment> getAllEquipment(){

        return equipmentRepository.findAll();
    }

    @Override
    public List<Equipment> search(String keyword){
        return equipmentRepository.search(keyword);
    }


    //code java

    @Override
    public Equipment getByID(Integer id){
        return equipmentRepository.findById(id).get();
    }

    @Override
    public void delete(Integer id){
        equipmentRepository.deleteById(id);
    }





}
