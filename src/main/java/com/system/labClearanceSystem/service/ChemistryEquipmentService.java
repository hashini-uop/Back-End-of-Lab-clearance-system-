package com.system.labClearanceSystem.service;

import com.system.labClearanceSystem.entity.ChemistryEquipment;


import java.util.List;

public interface ChemistryEquipmentService {
    public ChemistryEquipment saveChemistryEquipment(ChemistryEquipment chemistryEquipment);
    public List<ChemistryEquipment> getAllChemistryEquipment();

}
