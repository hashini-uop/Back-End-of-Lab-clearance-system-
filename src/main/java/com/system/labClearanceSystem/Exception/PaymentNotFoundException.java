package com.system.labClearanceSystem.Exception;

public class PaymentNotFoundException extends RuntimeException{
    public PaymentNotFoundException(int p_id){
        super("Could not found the equipment with id "+p_id);
    }
}
