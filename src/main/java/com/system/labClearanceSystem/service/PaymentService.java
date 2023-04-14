package com.system.labClearanceSystem.service;

import com.system.labClearanceSystem.entity.Payment;
import com.system.labClearanceSystem.entity.Student;

import java.util.List;

public interface PaymentService {
    public Payment savePayment(Payment payment);
    public List<Payment> getAllPayments();
}
