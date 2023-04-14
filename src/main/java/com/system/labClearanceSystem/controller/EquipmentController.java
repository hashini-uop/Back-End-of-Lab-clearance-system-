package com.system.labClearanceSystem.controller;

import com.system.labClearanceSystem.Exception.EquipmentNotFoundException;
import com.system.labClearanceSystem.entity.Equipment;
import com.system.labClearanceSystem.repository.EquipmentRepository;
import com.system.labClearanceSystem.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipment")
@CrossOrigin("http://localhost:3000")
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;
    @Autowired
    private EquipmentRepository equipmentRepository;


    //    save data
    @PostMapping("/add")
    public String add(@RequestBody Equipment equipment){
        equipmentService.saveEquipment(equipment);
        return "New Equipment is added";
    }

    @GetMapping("/getAll")
    public List<Equipment> getAllEquipment(){

        return equipmentService.getAllEquipment();
    }

    //Native Queries
    //Name = > price
    //Select price from Equipment where name=bikar

    @GetMapping("/getPriceByEquName/{equipment_id}")
    public int getPriceByEquName(@PathVariable Integer equipment_id ){

        return equipmentService.getPriceByEquName(equipment_id);
    }

    @GetMapping("/getById/{equipment_id}")
    Equipment getEquipmentById(@PathVariable int equipment_id){
        return equipmentRepository.findById(equipment_id)
                .orElseThrow(()->new EquipmentNotFoundException(equipment_id));


    }



    @PutMapping("/updateEquipment/{e_id}")
    Equipment updateEquipmentById(@RequestBody Equipment newEqu ,@PathVariable int e_id) {
        return equipmentRepository.findById(e_id)
                .map(equipment -> {
                    equipment.setName(newEqu.getName());
                    equipment.setType(newEqu.getType());
                    equipment.setDescription(newEqu.getDescription());
                    equipment.setQuantity(newEqu.getQuantity());
                    equipment.setE_price(newEqu.getE_price());
                    return equipmentRepository.save(equipment);

                }).orElseThrow(() -> new EquipmentNotFoundException(e_id));


        //borrow table
        //student/id/equipment

    }
    @DeleteMapping("/equipment/{id}")
    String deleteEqu(@PathVariable int id){
        if(!equipmentRepository.existsById(id)){
            throw  new EquipmentNotFoundException(id);
        }
        equipmentRepository.deleteById(id);
        return "Equipment with id "+id+" has been deleted successfully";
    }

    //Search method
    @GetMapping("/search")
    public String search(@Param("keyword") String keyword){
        System.out.println("keyword: " + keyword);
        return "search_result";
    }


}
