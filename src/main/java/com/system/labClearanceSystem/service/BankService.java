package com.system.labClearanceSystem.service;

import com.system.labClearanceSystem.entity.Bank;

import java.util.List;

public interface BankService {

    public  Bank saveBank(Bank bank);
    public List<Bank> getAllBanks();
}
