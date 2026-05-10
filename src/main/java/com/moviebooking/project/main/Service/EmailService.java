package com.moviebooking.project.main.Service;

public interface EmailService {

    void sendEmail(
            String to,
            String subject,
            String body
    );
}