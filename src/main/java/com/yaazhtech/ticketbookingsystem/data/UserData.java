package com.yaazhtech.ticketbookingsystem.data;

import jakarta.persistence.*;

import javax.lang.model.element.Name;

@Entity
@Table(name="users")

public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Column(name = "movie_name", nullable = false)
    private String movieName;
    @Column(name = "theatre_name", nullable = false)
    private String theatreName;
    @Column(name = "seat_number", nullable = false)
    private String seatNumber;
    @Column(name = "show_time", nullable = false)
    private String showTime;
    private double amount;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public UserData(Long userId, String movieName, String theatreName, String seatNumber, String showTime, double amount) {
        this.userId = userId;
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.seatNumber = seatNumber;
        this.showTime = showTime;
        this.amount = amount;
    }
}
