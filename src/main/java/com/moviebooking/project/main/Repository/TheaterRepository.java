package com.moviebooking.project.main.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviebooking.project.main.Entity.Theater;

public interface TheaterRepository
        extends JpaRepository<Theater, Long> {

    List<Theater>
    findByLocationContainingIgnoreCase(
            String location
    );
}