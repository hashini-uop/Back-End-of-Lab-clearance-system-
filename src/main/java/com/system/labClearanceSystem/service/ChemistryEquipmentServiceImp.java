package com.system.labClearanceSystem.service;

import com.system.labClearanceSystem.entity.ChemistryEquipment;
import com.system.labClearanceSystem.entity.Equipment;
import com.system.labClearanceSystem.repository.ChemistryEquipmentRepository;
import com.system.labClearanceSystem.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChemistryEquipmentServiceImp implements ChemistryEquipmentService {
    @Autowired
    private ChemistryEquipmentRepository chemistryEquipmentRepository;
    @Override
    public ChemistryEquipment saveChemistryEquipment(ChemistryEquipment chemistryEquipment){

        return chemistryEquipmentRepository.save(chemistryEquipment);
    }

    @Override
    public List<ChemistryEquipment> getAllChemistryEquipment(){

        return chemistryEquipmentRepository.findAll();
    }



}
