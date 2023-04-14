package com.system.labClearanceSystem.service;

import com.system.labClearanceSystem.entity.PhysicsEquipment;

import java.util.List;

public interface PhysicsEquipmentService {
    public PhysicsEquipment savePhysicsEquipment(PhysicsEquipment physicsEquipment);
    public List<PhysicsEquipment> getAllPhysicsEquipment();

}
