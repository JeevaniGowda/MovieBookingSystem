package com.moviebooking.project.main.Service;

import org.springframework.stereotype.Service;

import com.moviebooking.project.main.Entity.Admin;
import com.moviebooking.project.main.Repository.AdminRepository;

@Service
public class AdminServiceImpl
        implements AdminService {

    private final AdminRepository repository;

    public AdminServiceImpl(
            AdminRepository repository) {

        this.repository = repository;
    }

    @Override
    public Admin register(Admin admin) {

        if(repository.existsByEmail(
                admin.getEmail())) {

            throw new RuntimeException(
                    "Email already exists");
        }

        return repository.save(admin);
    }

    @Override
    public String login(
            String email,
            String password) {

        Admin admin =
                repository.findByEmail(email)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Invalid Email"));

        if(!admin.getPassword()
                .equals(password)) {

            throw new RuntimeException(
                    "Invalid Password");
        }

        return "Admin Login Successful";
    }
}