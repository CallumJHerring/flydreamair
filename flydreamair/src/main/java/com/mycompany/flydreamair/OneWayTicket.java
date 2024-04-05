package com.mycompany.flydreamair;

public class OneWayTicket extends Ticket {
    protected String comments;
    
    public OneWayTicket(int ticketID, String ticketOwnerName, String comments) {
        super(ticketID, ticketOwnerName);
        this.comments = comments;
    }
   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket ID: ").append(this.ticketID).append("\n");
        sb.append("Ticket Owner: ").append(this.ticketOwnerName).append("\n");
        sb.append("Comments: ").append(this.comments).append("\n");
        return sb.toString();
    }
}
