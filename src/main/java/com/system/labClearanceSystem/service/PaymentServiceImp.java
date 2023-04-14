package com.system.labClearanceSystem.service;

import com.system.labClearanceSystem.entity.Payment;
import com.system.labClearanceSystem.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaymentServiceImp implements PaymentService{
    @Autowired
    private PaymentRepository paymentRepository;
    @Override
    public Payment savePayment(Payment payment){
        return paymentRepository.save(payment);
    }

    @Override
    public List<Payment> getAllPayments(){

        return paymentRepository.findAll();
    }
}
