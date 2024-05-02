package com.mycompany.flydreamair;

import java.time.*;
import java.io.*;

public class Flight {
    
    public String departureCity;
    public String arrivalCity;
    public String departureDate;
    public String arrivalDate;
    public double price;
    private String seat;
    
    public Flight(String departureCity, String arrivalCity, String departureDate, String arrivalDate, double price, String seat) {
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
    
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }
    
    public String getDepartureDate() {
        return this.departureDate;
    }
    
        
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    
    public String getArrivalDate() {
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
