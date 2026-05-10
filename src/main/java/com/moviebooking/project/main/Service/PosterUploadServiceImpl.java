package com.moviebooking.project.main.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class PosterUploadServiceImpl
        implements PosterUploadService {

    private final String UPLOAD_DIR =
            "src/main/resources/static/posters/";

    @Override
    public String uploadPoster(
            MultipartFile file) {

        try {

            String fileName =
                    file.getOriginalFilename();

            Path path =
                    Paths.get(
                            UPLOAD_DIR + fileName
                    );

            Files.write(
                    path,
                    file.getBytes()
            );

            return fileName;

        } catch (IOException e) {

            throw new RuntimeException(
                    "Poster upload failed"
            );
        }
    }
}