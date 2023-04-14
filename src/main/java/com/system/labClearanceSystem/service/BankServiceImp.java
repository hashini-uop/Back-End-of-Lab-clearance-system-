package com.system.labClearanceSystem.service;

import com.system.labClearanceSystem.entity.Bank;
import com.system.labClearanceSystem.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankServiceImp implements BankService{
    @Autowired
    private BankRepository bankRepository;
    @Override
    public Bank saveBank(Bank bank){
        return bankRepository.save(bank);
    }

    @Override
    public List<Bank> getAllBanks(){
        return bankRepository.findAll();
    }
}
