package com.mycompany.flydreamair;

import java.util.*;

public class Flydreamair {

    public static void main(String[] args) {
        
        // Test User object and Ticket types
        // User will not own ticket, owns either OneWayTicket or ReturnTicket ID'd through super "ticketID"
        ArrayList<User> users = new ArrayList<>();
        User testUser = new User(1, "Callum", "Male");
        
        ArrayList<Ticket> tickets = new ArrayList<>();
        OneWayTicket testOneWayTicket = new OneWayTicket(101, "Callum", "Banned flyer");
        
        users.add(testUser);
        tickets.add(testOneWayTicket);
        
        System.out.println(testUser);
        System.out.println(testOneWayTicket);
        
        
    }
}
