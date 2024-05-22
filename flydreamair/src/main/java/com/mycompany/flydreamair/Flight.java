package com.mycompany.flydreamair;

import java.util.*;
import java.util.UUID;

public class Flight implements CompanyFileIO {
    
    private String departureCity;
    private String departureDate;
    private String arrivalDate;
    private String arrivalCity;
    private String price;
    private String seat;
    private final String ticketID;
    
    public Flight() {
        departureCity = "";
        departureDate = "";
        arrivalCity = "";
        arrivalDate = "";
        price = "";
        seat = "";
        ticketID = "";
    }
    
    public Flight(String departureCity, String departureDate, String arrivalCity, String arrivalDate, String price, String seat, String ticketID) {
        this.departureCity = departureCity;
        this.departureDate = departureDate;
        this.arrivalCity = arrivalCity;
        this.arrivalDate = arrivalDate;
        this.price = price;
        this.seat = seat;
        this.ticketID = ticketID;
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

    public String getTicketID() {
        return ticketID;
    }
   
    @Override
    public void writeData(Formatter formatter) {
        formatter.format("%s, %s, %s, %s, %s, %s, %s%n",
                departureCity, departureDate, arrivalCity, arrivalDate, price, seat, ticketID);
    }

    @Override
    public String toString() {
        return String.format("Airport Departing: %s, Departure Date: %s, Airport Destination: %s, Arrival Date: %s, Price: %s, Seating: %s, TicketID: %s",
                departureCity, departureDate, arrivalCity, arrivalDate, price, seat, ticketID);
    }
    
}
