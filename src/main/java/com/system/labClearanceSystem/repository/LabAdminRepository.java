package com.system.labClearanceSystem.repository;

import com.system.labClearanceSystem.entity.LabAdmin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LabAdminRepository extends JpaRepository<LabAdmin ,Integer> {
}