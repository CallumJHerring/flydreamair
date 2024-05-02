package com.mycompany.flydreamair;

import java.util.*;

public class User implements CompanyFileIO {
    private String username;
    private String password;
    private String email;
    private ArrayList<Ticket> tickets;
    
    public User() {
        username = "";
        password = "";
        email = "";
    }
    
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.tickets = tickets;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
    
    public ArrayList<Ticket> getTickets() {
        return this.tickets;
    }
   
    // [CH] Implement method
    public boolean addTicket(Ticket booking) {
        return false;
    }
    
    @Override
    public void writeData(Formatter formatter) {
        formatter.format("%s\n", toString());
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(this.username).append("\n");
        sb.append("Password: ").append(this.password).append("\n");
        sb.append("Email: ").append(this.email).append("\n");
        return sb.toString();
    }
    
}
