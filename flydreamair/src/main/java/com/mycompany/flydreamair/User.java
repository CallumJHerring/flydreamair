package com.mycompany.flydreamair;

import java.util.*;

public class User implements CompanyFileIO {
    private static int nextCustomerID = 1;
    private int customerID;
    private String username;
    private String password;
    private String email;
    private ArrayList<Flight> flights;
    
    public User() {
        username = "";
        password = "";
        email = "";
    }
    
    public User(String username, String password, String email) {
        this.customerID = nextCustomerID++;
        this.username = username;
        this.password = password;
        this.email = email;
        this.flights = flights;
    }
    
    public int getCustomerID() {
        return this.customerID;
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
    
    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
    
    public ArrayList<Flight> getFlights() {
        return this.flights;
    }
    
    @Override
    public void writeData(Formatter formatter) {
        formatter.format("%d, %s, %s, %s%n", customerID, username, password, email);
    }
    
    @Override
    public String toString() {
        return String.format("CustomerID: %d, Username: %s, Password: %s, Email: %s",
                customerID, username, password, email);
    }
    
}
