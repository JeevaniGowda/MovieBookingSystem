package com.moviebooking.project.main.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moviebooking.project.main.Entity.Movie;
import com.moviebooking.project.main.Repository.MovieRepository;

@Service
public class MovieServiceImpl
        implements MovieService {

    private final MovieRepository repository;

    public MovieServiceImpl(
            MovieRepository repository) {

        this.repository = repository;
    }

    @Override
    public Movie saveMovie(
            Movie movie) {

        return repository.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {

        return repository.findAll();
    }

    @Override
    public Movie getMovieById(
            Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Movie not found"));
    }

    @Override
    public List<Movie> searchMovie(
            String movieName) {

        return repository
                .findByMovieNameContainingIgnoreCase(
                        movieName);
    }

    @Override
    public List<Movie> getByGenre(
            String genre) {

        return repository
                .findByGenreContainingIgnoreCase(
                        genre);
    }

    @Override
    public void deleteMovie(
            Long id) {

        repository.deleteById(id);
    }
}