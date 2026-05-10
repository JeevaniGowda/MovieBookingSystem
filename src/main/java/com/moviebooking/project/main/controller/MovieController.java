package com.moviebooking.project.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.moviebooking.project.main.Entity.Movie;
import com.moviebooking.project.main.Service.MovieService;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin("*")
public class MovieController {

    private final MovieService service;

    public MovieController(
            MovieService service) {

        this.service = service;
    }

    @PostMapping
    public Movie save(
            @RequestBody Movie movie) {

        return service.saveMovie(movie);
    }

    @GetMapping
    public List<Movie> getAll() {

        return service.getAllMovies();
    }

    @GetMapping("/{id}")
    public Movie getById(
            @PathVariable Long id) {

        return service.getMovieById(id);
    }

    @GetMapping("/search/{name}")
    public List<Movie> search(
            @PathVariable String name) {

        return service.searchMovie(name);
    }

    @GetMapping("/genre/{genre}")
    public List<Movie> byGenre(
            @PathVariable String genre) {

        return service.getByGenre(genre);
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.deleteMovie(id);

        return "Movie deleted successfully";
    }
}