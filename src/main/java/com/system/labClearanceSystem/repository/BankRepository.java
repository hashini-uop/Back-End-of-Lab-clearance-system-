package com.system.labClearanceSystem.repository;

import com.system.labClearanceSystem.entity.Bank;
import com.system.labClearanceSystem.entity.BankID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank, BankID> {
}
