package com.system.labClearanceSystem.controller;

import com.system.labClearanceSystem.entity.ChemistryEquipment;
import com.system.labClearanceSystem.service.ChemistryEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/physicsEquipment")
@CrossOrigin("http://localhost:3000")
public class PhysicsEquipmentController {
    @Autowired
    private ChemistryEquipmentService chemistryEquipmentService;

    @PostMapping("/add")
    public String add(@RequestBody ChemistryEquipment chemistryEquipment){
        chemistryEquipmentService.saveChemistryEquipment(chemistryEquipment);
        return "New Chemistry Equipment is added";
    }

    @GetMapping("/getAll")
    public List<ChemistryEquipment> getAllChemistryEquipment(){

        return chemistryEquipmentService.getAllChemistryEquipment();
    }
}
