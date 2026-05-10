package com.moviebooking.project.main.Service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl
        implements EmailService {

    private final JavaMailSender sender;

    public EmailServiceImpl(
            JavaMailSender sender) {

        this.sender = sender;
    }

    @Override
    public void sendEmail(
            String to,
            String subject,
            String body) {

        SimpleMailMessage message =
                new SimpleMailMessage();

        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);

        sender.send(message);
    }
}