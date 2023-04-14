package com.system.labClearanceSystem.Exception;


public class EquipmentNotFoundException extends RuntimeException{
    public EquipmentNotFoundException(int e_id){
        super("Could not found the equipment with id "+e_id);
    }
}
