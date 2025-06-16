package com.app.hotell.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.hotell.Entity.Payment;
import com.app.hotell.Repository.PaymentRepository;



@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepo;

    public Page<Payment> getAllPaymentsPaged(Pageable pageable) {
        return paymentRepo.findAll(pageable);
    }

    public Payment createPayment(Payment payment){
        return paymentRepo.save(payment);
    }

    public Payment getPayment(Long id){
        return paymentRepo.findById(id).orElseThrow(() -> new RuntimeException("Payment not found"));
    }

    public List<Payment> getAllPayment(){
        return paymentRepo.findAll();
    }

    public Payment updatePayment(Long id, Payment updatedPayment){
        Payment existing = getPayment(id);
        existing.setAmount(updatedPayment.getAmount());
        existing.setPaymentMode(updatedPayment.getPaymentMode());
        existing.setPaymentStatus(updatedPayment.getPaymentStatus());
        return paymentRepo.save(existing);
    }

    public void deletePayment(Long id) {
        paymentRepo.deleteById(id);
    }
}
