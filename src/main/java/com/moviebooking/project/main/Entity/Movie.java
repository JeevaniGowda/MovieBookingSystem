package com.moviebooking.project.main.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String movieName;

    private String genre;

    private String language;

    private Double ticketPrice;

    private String imageUrl;

    private Integer duration;

    @ManyToOne
    @JoinColumn(name = "theater_id")
    @JsonIgnoreProperties({
            "hibernateLazyInitializer",
            "handler"
    })
    private Theater theater;

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(
            String movieName) {

        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(
            String genre) {

        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(
            String language) {

        this.language = language;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(
            Double ticketPrice) {

        this.ticketPrice = ticketPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(
            String imageUrl) {

        this.imageUrl = imageUrl;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(
            Integer duration) {

        this.duration = duration;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(
            Theater theater) {

        this.theater = theater;
    }
}