package com.moviebooking.project.main.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "theater")
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String theaterName;

    private String location;

    private Integer totalSeats;

    public Theater() {
    }

    public Long getId() {
        return id;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(
            String theaterName) {

        this.theaterName = theaterName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(
            String location) {

        this.location = location;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(
            Integer totalSeats) {

        this.totalSeats = totalSeats;
    }
}