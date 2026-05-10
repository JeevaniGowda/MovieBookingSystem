package com.moviebooking.project.main.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "seat")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String seatNumber;

    private String seatType;

    private Boolean booked;

    private Double price;

    public Seat() {
    }

    public Long getId() {
        return id;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(
            String seatNumber) {

        this.seatNumber = seatNumber;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(
            String seatType) {

        this.seatType = seatType;
    }

    public Boolean getBooked() {
        return booked;
    }

    public void setBooked(
            Boolean booked) {

        this.booked = booked;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(
            Double price) {

        this.price = price;
    }
}