package com.system.labClearanceSystem.controller;

import com.sun.jdi.request.InvalidRequestStateException;
import com.system.labClearanceSystem.Exception.StudentNotFoundException;
import com.system.labClearanceSystem.entity.Student;
import com.system.labClearanceSystem.repository.StudentRepository;
import com.system.labClearanceSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

//    save data
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


    @GetMapping("/getById/{s_regNo}")
    Student getById(@PathVariable("s_regNo") String s_regNo) throws InvalidRequestStateException {
        return studentRepository.findById(s_regNo)
                .orElseThrow(()->new StudentNotFoundException(s_regNo));


    }



    @PutMapping("/updateStudent/{e_id}")
    Student updateEById(@RequestBody Student newStu ,@PathVariable String s_regNo) {
        return studentRepository.findById(s_regNo)
                .map(student -> {
                    student.setS_regNo(newStu.getS_regNo());
                    student.setS_fName(newStu.getS_fName());
                    student.setS_lName(newStu.getS_lName());
                    student.setS_year(newStu.getS_year());
                    student.setS_mobile(newStu.getS_mobile());
                    return studentRepository.save(student);

                }).orElseThrow(() -> new StudentNotFoundException(s_regNo));


        //borrow table
        //student/id/equipment

    }
    @DeleteMapping("/{id}")
    String deleteStudent(@PathVariable String s_regNo){
        if(!studentRepository.existsById(s_regNo)){
            throw  new StudentNotFoundException(s_regNo);
        }
        studentRepository.deleteById(s_regNo);
        return "Student with registration number "+s_regNo+" has been deleted successfully";
    }


}
