package com.moviebooking.project.main.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviebooking.project.main.Entity.Movie;

public interface MovieRepository
        extends JpaRepository<Movie, Long> {

    List<Movie>
    findByMovieNameContainingIgnoreCase(
            String movieName
    );

    List<Movie>
    findByGenreContainingIgnoreCase(
            String genre
    );
}