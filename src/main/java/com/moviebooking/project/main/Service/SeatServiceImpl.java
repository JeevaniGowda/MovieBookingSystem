package com.moviebooking.project.main.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moviebooking.project.main.Entity.Seat;
import com.moviebooking.project.main.Repository.SeatRepository;

@Service
public class SeatServiceImpl
        implements SeatService {

    private final SeatRepository repository;

    public SeatServiceImpl(
            SeatRepository repository) {

        this.repository = repository;
    }

    @Override
    public Seat saveSeat(
            Seat seat) {

        return repository.save(seat);
    }

    @Override
    public List<Seat> getAllSeats() {

        return repository.findAll();
    }

    @Override
    public List<Seat> getAvailableSeats() {

        return repository.findByBooked(false);
    }

    @Override
    public void deleteSeat(
            Long id) {

        repository.deleteById(id);
    }
}