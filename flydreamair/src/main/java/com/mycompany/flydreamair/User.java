package com.mycompany.flydreamair;

import java.util.*;

public class User {
    private int userID;
    private String name;
    private String gender;
    private String password;
    private ArrayList<Ticket> tickets;
    
    public User(int userID, String name, String gender, String password) {
        this.userID = userID;
        this.name = name;
        this.gender = gender;
        this.password = password;
        this.tickets = tickets;
    }
    
    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    public int getUserID() {
        return this.userID;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setBookings(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
    
    public ArrayList<Ticket> getTickets() {
        return this.tickets;
    }
   
    public boolean addTicket(Ticket booking) {
        int newTicketID = booking.getTicketID();
        for (Ticket exisitngTicket: tickets) {
            if (exisitngTicket.getTicketID() == newTicketID) {
                
                return false;
                
            }
        } 
        tickets.add(booking);
        return true;
    }
    
    public int createUserID() {
        Random newID = new Random();
        return newID.nextInt(9000) + 1000;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserID: ").append(this.userID).append("\n");
        sb.append("Name: ").append(this.name).append("\n");
        sb.append("Gender: ").append(this.gender).append("\n");
        sb.append("Pin: ").append(this.password).append("\n");
        return sb.toString();
    }
}
