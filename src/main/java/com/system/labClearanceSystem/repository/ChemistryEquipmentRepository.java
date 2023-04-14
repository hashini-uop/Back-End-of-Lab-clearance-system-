package com.system.labClearanceSystem.repository;

import com.system.labClearanceSystem.entity.CEID;
import com.system.labClearanceSystem.entity.ChemistryEquipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChemistryEquipmentRepository extends JpaRepository<ChemistryEquipment , CEID> {
}
