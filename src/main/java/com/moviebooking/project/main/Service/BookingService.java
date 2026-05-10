package com.moviebooking.project.main.Service;

import java.util.List;

import com.moviebooking.project.main.Entity.Booking;

public interface BookingService {

    Booking saveBooking(Booking booking);

    List<Booking> getAllBookings();

    List<Booking> getBookingsByUser(Long userId);

    void deleteBooking(Long id);
}