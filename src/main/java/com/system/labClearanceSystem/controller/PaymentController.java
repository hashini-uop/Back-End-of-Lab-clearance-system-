package com.system.labClearanceSystem.controller;

import com.system.labClearanceSystem.Exception.PaymentNotFoundException;
import com.system.labClearanceSystem.entity.Payment;
import com.system.labClearanceSystem.repository.PaymentRepository;
import com.system.labClearanceSystem.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/payment")
@CrossOrigin
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private PaymentRepository paymentRepository;

    //    save data
    @PostMapping("/add")
    public String add(@RequestBody Payment payment){
        paymentService.savePayment(payment);
        return "New Payment is added";
    }

    @GetMapping("/getAll")
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }

    @GetMapping("/getById/{payment_id}")
    Payment getById(@PathVariable int payment_id){
        return paymentRepository.findById(payment_id)
                .orElseThrow(()->new PaymentNotFoundException(payment_id));


    }

    @DeleteMapping("/{id}")
    String delete(@PathVariable int id){
        if(!paymentRepository.existsById(id)){
            throw  new PaymentNotFoundException(id);
        }
        paymentRepository.deleteById(id);
        return "Equipment with id "+id+" has been deleted successfully";
    }








}
