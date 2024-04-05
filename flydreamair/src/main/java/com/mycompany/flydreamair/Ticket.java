package com.mycompany.flydreamair;

public class Ticket {
    protected int ticketID;
    protected int customerID;
    protected String ticketOwnerName;
    
    public Ticket(int ticketID, int customerID, String ticketOwnerName) {
        this.ticketID = ticketID;
        this.customerID = customerID;
        this.ticketOwnerName = ticketOwnerName;
    }
    
    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }
    public int getTicketID() {
        return this.ticketID;
    }
    
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    
    public int getCustomerID() {
        return this.customerID;
    }
    
    public void setTicketOwnerName(String ticketOwnerName) {
        this.ticketOwnerName = ticketOwnerName;
    }
    
    public String getTicketOwnerName() {
        return this.ticketOwnerName;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket ID: ").append(this.ticketID).append("\n");
        sb.append("Customer ID: ").append(this.customerID).append("\n");
        sb.append("Ticket Owner: ").append(this.ticketOwnerName).append("\n");
        return sb.toString();
    }
}
