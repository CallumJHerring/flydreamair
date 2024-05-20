package com.mycompany.flydreamair;

public class Ticket {
    private User user;
    private Flight flight;
    
    public Ticket() {
        user = new User();
        flight = new Flight();
    }
    
    public Ticket(User user, Flight flight) {
        this.user = user;
        this.flight = flight;
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
    
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User Information: \n").append(this.user).append("\n");
        sb.append("Flight Information: \n").append(this.flight).append("\n");
        return sb.toString();
    }
    
}
