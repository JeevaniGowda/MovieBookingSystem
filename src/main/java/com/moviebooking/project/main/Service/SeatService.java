package com.moviebooking.project.main.Service;

import java.util.List;

import com.moviebooking.project.main.Entity.Seat;

public interface SeatService {

    Seat saveSeat(Seat seat);

    List<Seat> getAllSeats();

    List<Seat> getAvailableSeats();

    void deleteSeat(Long id);
}