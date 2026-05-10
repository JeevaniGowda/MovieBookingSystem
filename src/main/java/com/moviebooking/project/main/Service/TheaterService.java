package com.moviebooking.project.main.Service;

import java.util.List;

import com.moviebooking.project.main.Entity.Theater;

public interface TheaterService {

    Theater saveTheater(
            Theater theater
    );

    List<Theater> getAllTheaters();

    List<Theater> searchByLocation(
            String location
    );

    void deleteTheater(Long id);
}