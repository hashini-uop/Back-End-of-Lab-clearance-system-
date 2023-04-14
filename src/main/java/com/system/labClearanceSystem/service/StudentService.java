package com.system.labClearanceSystem.service;

import com.system.labClearanceSystem.entity.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
