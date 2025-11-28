package com.yaazhtech.ticketbookingsystem.model;

public class UserRequest {
      Long userId;
    private String movieName;
    private String theatreName;
    private String sprivateeatNumber;
    private String moblieNumber;
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
    public void setMoblieNumber(String moblieNumber) {
        this.moblieNumber = moblieNumber;
    }
    public String getShowTime() {
        return showTime;
    }

    public double getAmount() {
        return amount;
    }

    public String getMoblieNumber() {
        return moblieNumber;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public UserRequest(Long userId, String movieName, String theatreName, String seatNumber, String moblieNumber, String showTime, double amount) {
        this.userId = userId;
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.seatNumber = seatNumber;
        this.moblieNumber = moblieNumber;
        this.showTime = showTime;
        this.amount = amount;
    }
}
