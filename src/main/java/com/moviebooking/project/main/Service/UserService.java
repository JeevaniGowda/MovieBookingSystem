package com.moviebooking.project.main.Service;

import java.util.List;

import com.moviebooking.project.main.Entity.User;

public interface UserService {

    User register(User user);

    String login(
            String email,
            String password
    );

    List<User> getAllUsers();

    void deleteUser(Long id);
}