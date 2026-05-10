package com.moviebooking.project.main.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentMode;

    private Double amount;

    private String paymentStatus;

    private String transactionId;

    public Payment() {
    }

    public Long getId() {
        return id;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(
            String paymentMode) {

        this.paymentMode = paymentMode;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(
            Double amount) {

        this.amount = amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(
            String paymentStatus) {

        this.paymentStatus = paymentStatus;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(
            String transactionId) {

        this.transactionId = transactionId;
    }
}