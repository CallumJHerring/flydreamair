package com.mycompany.flydreamair;

public class OneWayTicket extends Ticket {
    protected String comments;
    
    public OneWayTicket(int ticketID, int customerID, String ticketOwnerName, String comments) {
        super(ticketID, customerID, ticketOwnerName);
        this.comments = comments;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    public String getComments() {
        return this.comments;
    }
   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket ID: ").append(this.ticketID).append("\n");
        sb.append("Customer ID: ").append(this.customerID).append("\n");
        sb.append("Ticket Owner: ").append(this.ticketOwnerName).append("\n");
        sb.append("Comments: ").append(this.comments).append("\n");
        return sb.toString();
    }
}
