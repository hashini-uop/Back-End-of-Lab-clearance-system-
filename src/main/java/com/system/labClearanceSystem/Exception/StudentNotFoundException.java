package com.system.labClearanceSystem.Exception;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String s_regNo){
        super("Could not found the student with id "+s_regNo);
    }
}
