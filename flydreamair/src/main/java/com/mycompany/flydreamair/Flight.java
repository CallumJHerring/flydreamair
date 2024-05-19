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
    private String ticketID;
    
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
        this.ticketID = UUID.randomUUID().toString();
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
    
    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }
    
    public String getTicketID() {
        return this.ticketID;
    }
    
    @Override
    public void writeData(Formatter formatter) {
        formatter.format("%s\n", toString());
    }
         
    /*
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Airport Departing: ").append(this.departureCity).append("\n");
        sb.append("Departure Date: ").append(this.departureDate.toString()).append("\n");
        sb.append("Airport Destination: ").append(this.arrivalCity).append("\n");
        sb.append("Arrival Date: ").append(this.arrivalDate.toString()).append("\n");
        sb.append("Price: ").append(this.price).append("\n");
        sb.append("Seating: ").append(this.seat).append("\n");
        sb.append("Reference: ").append(this.ticketID).append("");
        return sb.toString();
    }
    */
    
    @Override
    public String toString() {
        return "Airport Departing: " + departureCity + ", Departure Date: " + departureDate + ", Airport Destination: " + arrivalCity +
                ", Arrival Date: " + arrivalDate + ", Price: " + price + ", Seating: " + seat + ", TicketID: " + ticketID;
    }
    
}
