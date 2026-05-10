package com.moviebooking.project.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviebooking.project.main.Entity.Payment;

public interface PaymentRepository
        extends JpaRepository<Payment, Long> {

}