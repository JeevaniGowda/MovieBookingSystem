package com.moviebooking.project.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.moviebooking.project.main.Entity.Theater;
import com.moviebooking.project.main.Service.TheaterService;

@RestController
@RequestMapping("/api/theaters")
@CrossOrigin("*")
public class TheaterController {

    private final TheaterService service;

    public TheaterController(
            TheaterService service) {

        this.service = service;
    }

    @PostMapping
    public Theater save(
            @RequestBody Theater theater) {

        return service.saveTheater(theater);
    }

    @GetMapping
    public List<Theater> getAll() {

        return service.getAllTheaters();
    }

    @GetMapping("/location/{location}")
    public List<Theater> search(
            @PathVariable String location) {

        return service.searchByLocation(location);
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.deleteTheater(id);

        return "Theater deleted successfully";
    }
}