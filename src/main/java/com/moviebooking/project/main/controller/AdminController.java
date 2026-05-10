package com.moviebooking.project.main.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.moviebooking.project.main.Entity.Admin;
import com.moviebooking.project.main.Service.AdminService;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin("*")
public class AdminController {

    private final AdminService service;

    public AdminController(
            AdminService service) {

        this.service = service;
    }

    @PostMapping("/register")
    public Admin register(
            @RequestBody Admin admin) {

        return service.register(admin);
    }

    @PostMapping("/login")
    public String login(
            @RequestBody
            Map<String,String> data) {

        return service.login(
                data.get("email"),
                data.get("password")
        );
    }
}