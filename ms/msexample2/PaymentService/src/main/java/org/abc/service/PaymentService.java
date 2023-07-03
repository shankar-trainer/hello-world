package org.abc.service;

import org.abc.entity.Payment;
import org.abc.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    public Payment savePayment(Payment payment){
    return      paymentRepository.save(payment);
    }

    public List<Payment> getOrderList(){
        return  paymentRepository.findAll();
    }

     public Payment findPaymentHistoryByOrderId(int orderId) throws JsonProcessingException     {
        Payment payment=paymentRepository.findByOrderId(orderId);
        return payment ;
    }



}
