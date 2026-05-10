package com.moviebooking.project.main.controller;

import org.springframework.web.bind.annotation.*;

import com.moviebooking.project.main.Service.EmailService;

@RestController
@RequestMapping("/api/email")
@CrossOrigin("*")
public class EmailController {

    private final EmailService service;

    public EmailController(
            EmailService service) {

        this.service = service;
    }

    @PostMapping("/send")
    public String sendMail(

            @RequestParam String to,
            @RequestParam String subject,
            @RequestParam String body
    ) {

        service.sendEmail(
                to,
                subject,
                body
        );

        return "Email Sent Successfully";
    }
}