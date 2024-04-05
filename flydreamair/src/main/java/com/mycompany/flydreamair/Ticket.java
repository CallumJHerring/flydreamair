package com.mycompany.flydreamair;

public class Ticket {
    protected int ticketID;
    protected String ticketOwnerName;
    
    public Ticket(int ticketID, String ticketOwnerName) {
        this.ticketID = ticketID;
        this.ticketOwnerName = ticketOwnerName;
    }
    
    public int getBookingID() {
        return this.ticketID;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket ID: ").append(this.ticketID).append("\n");
        sb.append("Ticket Owner: ").append(this.ticketOwnerName).append("\n");
        return sb.toString();
    }
}
