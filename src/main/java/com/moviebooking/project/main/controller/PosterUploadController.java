package com.moviebooking.project.main.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.moviebooking.project.main.Service.PosterUploadService;

@RestController
@RequestMapping("/api/poster")
@CrossOrigin("*")
public class PosterUploadController {

    private final PosterUploadService service;

    public PosterUploadController(
            PosterUploadService service) {

        this.service = service;
    }

    @PostMapping(
            consumes = "multipart/form-data"
    )
    public String uploadPoster(
            @RequestParam("file")
            MultipartFile file) {

        return service.uploadPoster(file);
    }
}