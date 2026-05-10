package com.moviebooking.project.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.moviebooking.project.main.Entity.Booking;
import com.moviebooking.project.main.Service.BookingService;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin("*")
public class BookingController {

    private final BookingService service;

    public BookingController(
            BookingService service) {

        this.service = service;
    }

    @PostMapping
    public Booking save(
            @RequestBody Booking booking) {

        return service.saveBooking(booking);
    }

    @GetMapping
    public List<Booking> getAll() {

        return service.getAllBookings();
    }

    @GetMapping("/user/{userId}")
    public List<Booking> getByUser(
            @PathVariable Long userId) {

        return service.getBookingsByUser(userId);
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.deleteBooking(id);

        return "Booking deleted successfully";
    }
}