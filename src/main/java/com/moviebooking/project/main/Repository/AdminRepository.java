package com.moviebooking.project.main.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviebooking.project.main.Entity.Admin;

public interface AdminRepository
        extends JpaRepository<Admin, Long> {

    boolean existsByEmail(String email);

    Optional<Admin> findByEmail(String email);
}