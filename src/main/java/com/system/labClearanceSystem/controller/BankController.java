package com.system.labClearanceSystem.controller;


import com.system.labClearanceSystem.entity.Bank;
import com.system.labClearanceSystem.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")
@CrossOrigin
public class BankController {
    @Autowired
    private BankService bankService;

    @PostMapping("/add")
    public String add(@RequestBody Bank bank){
        bankService.saveBank(bank);
        return "New Bank is added";
    }

    @GetMapping("/getAll")
    public List<Bank> getAllSBanks(){

        return bankService.getAllBanks();
    }

}

