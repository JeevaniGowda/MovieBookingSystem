package com.moviebooking.project.main.Service;

import java.util.List;

import com.moviebooking.project.main.Entity.Movie;

public interface MovieService {

    Movie saveMovie(Movie movie);

    List<Movie> getAllMovies();

    Movie getMovieById(Long id);

    List<Movie> searchMovie(
            String movieName
    );

    List<Movie> getByGenre(
            String genre
    );

    void deleteMovie(Long id);
}