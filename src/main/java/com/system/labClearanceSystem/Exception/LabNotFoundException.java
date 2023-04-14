package com.system.labClearanceSystem.Exception;

public class LabNotFoundException extends  RuntimeException{
    public LabNotFoundException(int l_id){
        super("Could not found the equipment with id "+l_id);
    }
}
