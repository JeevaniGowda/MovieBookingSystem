package com.moviebooking.project.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.moviebooking.project.main.Entity.Seat;
import com.moviebooking.project.main.Service.SeatService;

@RestController
@RequestMapping("/api/seats")
@CrossOrigin("*")
public class SeatController {

    private final SeatService service;

    public SeatController(
            SeatService service) {

        this.service = service;
    }

    @PostMapping
    public Seat save(
            @RequestBody Seat seat) {

        return service.saveSeat(seat);
    }

    @GetMapping
    public List<Seat> getAll() {

        return service.getAllSeats();
    }

    @GetMapping("/available")
    public List<Seat> availableSeats() {

        return service.getAvailableSeats();
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.deleteSeat(id);

        return "Seat deleted successfully";
    }
}