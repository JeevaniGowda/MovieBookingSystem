package com.moviebooking.project.main.Service;

import com.moviebooking.project.main.Entity.Admin;

public interface AdminService {

    Admin register(Admin admin);

    String login(String email,
                 String password);
}