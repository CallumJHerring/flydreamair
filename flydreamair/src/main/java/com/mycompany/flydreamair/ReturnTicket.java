package com.mycompany.flydreamair;

public class ReturnTicket extends Ticket {
    protected String dietComments;
    
    public ReturnTicket(int ticketID, String ticketOwnerName, String dietComments) {
        super(ticketID, ticketOwnerName);
        this.dietComments = dietComments;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket ID: ").append(this.ticketID).append("\n");
        sb.append("Ticket Owner: ").append(this.ticketOwnerName).append("\n");
        sb.append("Dietary Comments: ").append(this.dietComments).append("\n");
        return sb.toString();
    }
    
}
