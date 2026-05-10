package com.moviebooking.project.main.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moviebooking.project.main.Entity.Theater;
import com.moviebooking.project.main.Repository.TheaterRepository;

@Service
public class TheaterServiceImpl
        implements TheaterService {

    private final TheaterRepository repository;

    public TheaterServiceImpl(
            TheaterRepository repository) {

        this.repository = repository;
    }

    @Override
    public Theater saveTheater(
            Theater theater) {

        return repository.save(theater);
    }

    @Override
    public List<Theater> getAllTheaters() {

        return repository.findAll();
    }

    @Override
    public List<Theater> searchByLocation(
            String location) {

        return repository
                .findByLocationContainingIgnoreCase(
                        location);
    }

    @Override
    public void deleteTheater(
            Long id) {

        repository.deleteById(id);
    }
}