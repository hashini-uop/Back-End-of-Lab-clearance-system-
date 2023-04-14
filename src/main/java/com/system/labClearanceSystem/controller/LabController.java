package com.system.labClearanceSystem.controller;


import com.system.labClearanceSystem.Exception.LabNotFoundException;
import com.system.labClearanceSystem.entity.Lab;
import com.system.labClearanceSystem.repository.LabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.system.labClearanceSystem.service.LabService;

import java.util.List;

@RestController
@RequestMapping("/lab")
@CrossOrigin("http://localhost:3000")
public class LabController {

    //SQL QUERIES
    @Autowired
    private LabService labService;
    @Autowired
    private LabRepository labRepository;

    //    save data
    @PostMapping("/add") // post data
    public String add(@RequestBody Lab lab){
        labService.saveLab(lab);
        return "New Lab is added";
    }

    @GetMapping("/getAll") //withdrew
    public List<Lab> getAllLab(){

        return labService.getAllLabs();
    }



    //NATIVE QUERIES
    // user id => user details
    // SELECT * FROM USER WHERE ID=2

    //1 . REPOSITORY
    //2 . Service to call data

    @GetMapping("/getLabByLabID/{labID}")
    public Lab getUserByLabID(@PathVariable int labID){
        return labService.getLabByLabID(labID);
    }


    //lab id & lab type given

    @GetMapping("/getLabByLabIDANDLabType/{labID}/{labType}")
    public Lab getUserByLabID(@PathVariable int labID , @PathVariable String labType){
        return labService.getLabByLabIDANDLabType(labID , labType);
    }

    //CRUD for table
    @GetMapping("/getById/{lab_id}")
    Lab getLabById(@PathVariable int lab_id){
        return labRepository.findById(lab_id)
                .orElseThrow(()->new LabNotFoundException(lab_id));


    }



    @PutMapping("/update/{lab_id}")
    Lab updateById(@RequestBody Lab newL,@PathVariable int l_id) {
        return labRepository.findById(l_id)
                .map(lab -> {
                    lab.setCode(newL.getCode());
                    lab.setL_name(newL.getL_name());
                    lab.setL_category(newL.getL_category());
                    lab.setL_type(newL.getL_type());
                    lab.setL_num(newL.getL_num());
                    lab.setL_location(newL.getL_location());
                    return labRepository.save(lab);

                }).orElseThrow(() -> new LabNotFoundException(l_id));


        //borrow table
        //student/id/equipment

    }
    @DeleteMapping("/delete/{id}")
    String deleteLab(@PathVariable int id){
        if(!labRepository.existsById(id)){
            throw  new LabNotFoundException(id);
        }
        labRepository.deleteById(id);
        return "Lab with id "+id+" has been deleted successfully";
    }






}
