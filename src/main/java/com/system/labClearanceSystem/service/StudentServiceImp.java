package com.system.labClearanceSystem.service;

import com.system.labClearanceSystem.entity.Student;
import com.system.labClearanceSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }




}
