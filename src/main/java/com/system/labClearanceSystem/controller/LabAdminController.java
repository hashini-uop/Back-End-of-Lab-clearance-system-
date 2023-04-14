package com.system.labClearanceSystem.controller;

import com.system.labClearanceSystem.entity.LabAdmin;
import com.system.labClearanceSystem.service.LabAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/labAdmin")
@CrossOrigin
public class LabAdminController {
    @Autowired
    private LabAdminService labAdminService;

    //    save data
    @PostMapping("/add")
    public String add(@RequestBody LabAdmin labAdmin){
        labAdminService.saveLabAdmin(labAdmin);
        return "New Lab Admin is added";
    }

    @GetMapping("/getAll")
    public List<LabAdmin> getAllLabAdmins(){
        return labAdminService.getAllLabAdmins();
    }

}
