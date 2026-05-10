package com.moviebooking.project.main.Service;

import org.springframework.web.multipart.MultipartFile;

public interface PosterUploadService {

    String uploadPoster(
            MultipartFile file
    );
}