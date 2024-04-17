package com.mycompany.flydreamair;

import java.util.UUID; // [CH] Universally Unique Identifier

public class Ticket {
    private User user;
    private Flight flight;
    private String ticketID;
    
    public Ticket(User user, Flight flight) {
        this.user = user;
        this.flight = flight;
        this.ticketID = UUID.randomUUID().toString();
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    public User getUser() {
        return this.user;
    }
    
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
    public Flight getFlight() {
        return this.flight;
    }
    
    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }
    
    public String getTicketID() {
        return this.ticketID;
    }
    
    /*
    public String generateTicketNumber() {
        return UUID.randomUUID().toString();
    }
    */
    /*
    @Override
    public String toString() {
        return "User: " + user + "Flight: "
    }
    */
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User Information: \n").append(this.user).append("\n");
        sb.append("Flight Information: \n").append(this.flight).append("\n");
        sb.append("Booking Reference: ").append(this.ticketID).append("\n");
        return sb.toString();
    }
    
}
