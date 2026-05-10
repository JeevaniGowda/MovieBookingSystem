package com.moviebooking.project.main.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviebooking.project.main.Entity.Seat;

public interface SeatRepository
        extends JpaRepository<Seat, Long> {

    List<Seat> findByBooked(Boolean booked);
}