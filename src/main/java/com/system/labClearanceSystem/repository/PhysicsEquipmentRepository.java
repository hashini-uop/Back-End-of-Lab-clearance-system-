package com.system.labClearanceSystem.repository;

import com.system.labClearanceSystem.entity.PEID;
import com.system.labClearanceSystem.entity.PhysicsEquipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhysicsEquipmentRepository extends JpaRepository<PhysicsEquipment , PEID> {
}
