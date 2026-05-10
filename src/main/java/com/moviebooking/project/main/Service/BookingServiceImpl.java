package com.moviebooking.project.main.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moviebooking.project.main.Entity.Booking;
import com.moviebooking.project.main.Repository.BookingRepository;

@Service
public class BookingServiceImpl
        implements BookingService {

    private final BookingRepository repository;

    public BookingServiceImpl(
            BookingRepository repository) {

        this.repository = repository;
    }

    @Override
    public Booking saveBooking(
            Booking booking) {

        return repository.save(booking);
    }

    @Override
    public List<Booking> getAllBookings() {

        return repository.findAll();
    }

    @Override
    public List<Booking> getBookingsByUser(
            Long userId) {

        return repository.findByUserId(userId);
    }

    @Override
    public void deleteBooking(Long id) {

        repository.deleteById(id);
    }
}