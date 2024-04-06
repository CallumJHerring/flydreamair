package com.mycompany.flydreamair;

import java.util.*;

public class Flydreamair {

    public static void main(String[] args) {
        
        // [CH] Opens application, please do not make changes to design in form LoginPage.java
        /*
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        */
        
        // [CH] Test User object and Ticket types
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Ticket> tickets = new ArrayList<>();
        
        User testUser = new User(1, "Callum", "Male", 1234);
        OneWayTicket testOneWayTicket = new OneWayTicket(101, 1, "Callum", "Banned flyer");
        ReturnTicket testReturnTicket = new ReturnTicket(102,1, "Callum", "Vegan");
        
        users.add(testUser);
        tickets.add(testOneWayTicket);
        tickets.add(testReturnTicket);
        
        System.out.println(testUser);
        System.out.println(testOneWayTicket);
        System.out.println(testReturnTicket);
        
    }
}
