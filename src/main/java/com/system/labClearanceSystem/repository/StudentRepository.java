package com.system.labClearanceSystem.repository;

import com.system.labClearanceSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,String>{

}
