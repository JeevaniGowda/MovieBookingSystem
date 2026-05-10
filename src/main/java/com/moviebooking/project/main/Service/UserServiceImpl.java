package com.moviebooking.project.main.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moviebooking.project.main.Entity.User;
import com.moviebooking.project.main.Repository.UserRepository;

@Service
public class UserServiceImpl
        implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(
            UserRepository repository) {

        this.repository = repository;
    }

    @Override
    public User register(
            User user) {

        if(repository.existsByEmail(
                user.getEmail())) {

            throw new RuntimeException(
                    "Email already exists");
        }

        return repository.save(user);
    }

    @Override
    public String login(
            String email,
            String password) {

        User user =
                repository.findByEmail(email)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Invalid Email"));

        if(!user.getPassword()
                .equals(password)) {

            throw new RuntimeException(
                    "Invalid Password");
        }

        return "Login Successful";
    }

    @Override
    public List<User> getAllUsers() {

        return repository.findAll();
    }

    @Override
    public void deleteUser(
            Long id) {

        repository.deleteById(id);
    }
}