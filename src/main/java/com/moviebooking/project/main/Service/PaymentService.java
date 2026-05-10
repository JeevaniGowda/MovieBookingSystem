package com.moviebooking.project.main.Service;

import java.util.List;

import org.json.JSONObject;

import com.moviebooking.project.main.Entity.Payment;

public interface PaymentService {

    JSONObject createOrder(
            Integer amount
    ) throws Exception;

    Payment savePayment(
            Payment payment
    );

    List<Payment> getAllPayments();

    void deletePayment(Long id);
}