package com.mycompany.flydreamair;

import java.time.*;
import java.io.*;

public class Flight implements Serializable {
    
    public String departureCity;
    public String arrivalCity;
    public LocalDateTime departureDate;
    public LocalDateTime arrivalDate;
    public double price;
    private String seat;
    
    public Flight(String departureCity, String arrivalCity, LocalDateTime departureDate, LocalDateTime arrivalDate, double price, String seat) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.price = price;
        this.seat = seat;
    }
    
    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }
    
    public String getDepartureCity() {
        return this.departureCity;
    }
    
    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }
    
    public String getArrivalCity() {
        return this.arrivalCity;
    }
    
    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }
    
    public LocalDateTime getDepartureDate() {
        return this.departureDate;
    }
    
    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    
    public LocalDateTime getArrivalDate() {
        return this.arrivalDate;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public void setSeat(String seat) {
        this.seat = seat;
    }
    
    public String getSeat() {
        return this.seat;
    }
            
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Airport Departing: ").append(this.departureCity).append("\n");
        sb.append("Airport Destination: ").append(this.arrivalCity).append("\n");
        sb.append("Departure Date: ").append(this.departureDate.toString()).append("\n");
        sb.append("Arrival Date: ").append(this.arrivalDate.toString()).append("\n");
        sb.append("Seating: ").append(this.seat).append("\n");
        return sb.toString();
    }
    
}
