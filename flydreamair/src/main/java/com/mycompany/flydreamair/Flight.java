package com.mycompany.flydreamair;

import java.time.*;
import java.io.*;
import java.util.*;

public class Flight implements CompanyFileIO {
    
    public String departureCity;
    public String departureDate;
    public String arrivalDate;
    public String arrivalCity;
    public String price;
    private String seat;
    
    public Flight() {
        departureCity = "";
        departureDate = "";
        arrivalCity = "";
        arrivalDate = "";
        price = "";
        seat = "";
    }
    
    public Flight(String departureCity, String departureDate, String arrivalCity, String arrivalDate, String price, String seat) {
        this.departureCity = departureCity;
        this.departureDate = departureDate;
        this.arrivalCity = arrivalCity;
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
    
    
    public void setPrice(String price) {
        this.price = price;
    }
    
    public String getPrice() {
        return this.price;
    }
    
    public void setSeat(String seat) {
        this.seat = seat;
    }
    
    public String getSeat() {
        return this.seat;
    }
    
    @Override
    public void writeData(Formatter formatter) {
        formatter.format("%s\n", toString());
    }
            
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Airport Departing: ").append(this.departureCity).append("\n");
        sb.append("Departure Date: ").append(this.departureDate.toString()).append("\n");
        sb.append("Airport Destination: ").append(this.arrivalCity).append("\n");
        sb.append("Arrival Date: ").append(this.arrivalDate.toString()).append("\n");
        sb.append("Price: ").append(this.price).append("\n");
        sb.append("Seating: ").append(this.seat).append("\n");
        return sb.toString();
    }
    
}
