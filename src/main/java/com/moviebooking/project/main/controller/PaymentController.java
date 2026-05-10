package com.moviebooking.project.main.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import com.moviebooking.project.main.Entity.Payment;
import com.moviebooking.project.main.Service.PaymentService;

@RestController
@RequestMapping("/api/payment")
@CrossOrigin("*")
public class PaymentController {

    private final PaymentService service;

    public PaymentController(
            PaymentService service) {

        this.service = service;
    }

    @PostMapping("/create-order")
    public String createOrder(

            @RequestParam Integer amount

    ) throws Exception {

        JSONObject order =
                service.createOrder(amount);

        return order.toString();
    }

    @PostMapping
    public Payment save(
            @RequestBody Payment payment) {

        return service.savePayment(payment);
    }

    @GetMapping
    public List<Payment> getAll() {

        return service.getAllPayments();
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.deletePayment(id);

        return "Payment deleted successfully";
    }
}