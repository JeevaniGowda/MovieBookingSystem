package com.moviebooking.project.main.Service;

import java.util.List;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.moviebooking.project.main.Entity.Payment;
import com.moviebooking.project.main.Repository.PaymentRepository;

@Service
public class PaymentServiceImpl
        implements PaymentService {

    private final PaymentRepository repository;

    public PaymentServiceImpl(
            PaymentRepository repository) {

        this.repository = repository;
    }

    @Override
    public JSONObject createOrder(
            Integer amount)
            throws Exception {

        JSONObject object =
                new JSONObject();

        object.put(
                "amount",
                amount * 100
        );

        object.put(
                "currency",
                "INR"
        );

        object.put(
                "receipt",
                "txn_123456"
        );

        return object;
    }

    @Override
    public Payment savePayment(
            Payment payment) {

        return repository.save(payment);
    }

    @Override
    public List<Payment> getAllPayments() {

        return repository.findAll();
    }

    @Override
    public void deletePayment(
            Long id) {

        repository.deleteById(id);
    }
}