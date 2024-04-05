package com.mycompany.flydreamair;

import java.util.ArrayList;

public class User {
    private int userID;
    private String name;
    private String gender;
    public ArrayList<Ticket> bookings;
    
    
    public User(int userID, String name, String gender) {
        this.userID = userID;
        this.name = name;
        this.gender = gender;
        this.bookings = bookings;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserID: ").append(this.userID).append("\n");
        sb.append("Name: ").append(this.name).append("\n");
        sb.append("Gender: ").append(this.gender).append("\n");
        sb.append("Bookings: ").append(this.bookings).append("\n");
        return sb.toString();
    }
}
