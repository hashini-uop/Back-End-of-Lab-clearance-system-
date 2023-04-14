package com.system.labClearanceSystem.service;

import com.system.labClearanceSystem.entity.PhysicsEquipment;
import com.system.labClearanceSystem.repository.PhysicsEquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhysicsEquipmentServiceImp implements PhysicsEquipmentService{
    @Autowired
    private PhysicsEquipmentRepository physicsEquipmentRepository;
    @Override
    public PhysicsEquipment savePhysicsEquipment(PhysicsEquipment physicsEquipment){

        return physicsEquipmentRepository.save(physicsEquipment);
    }

    @Override
    public List<PhysicsEquipment> getAllPhysicsEquipment(){

        return physicsEquipmentRepository.findAll();
    }

}
