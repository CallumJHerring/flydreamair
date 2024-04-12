package com.mycompany.flydreamair;

import java.util.*;
import java.io.*;
import java.text.*;



public class Flydreamair implements Serializable {

    public static void main(String[] args) {
        // [CH] Opens application, comment these lines out if you need to test code
        
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        
        // --------------------------------------------------------------- \\
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));    
        
        // Start of project
        
        // [CH] Test User object and Ticket types
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Ticket> tickets = new ArrayList<>();
        ArrayList<Flight> flights = new ArrayList<>();
        
        User testUser = new User(1, "Callum", "Male", "password1");
        OneWayTicket testOneWayTicket = new OneWayTicket(101, 1, "Callum", "Banned flyer");
        ReturnTicket testReturnTicket = new ReturnTicket(102,1, "Callum", "Vegan");
        
        users.add(testUser);
        tickets.add(testOneWayTicket);
        tickets.add(testReturnTicket);
        
        System.out.println(testUser);
        System.out.println(testOneWayTicket);
        System.out.println(testReturnTicket);
        
        /*
        // [CH] Menu for testing components before GUI implementation
        int choice = 0;
 
        while (choice != 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nTest Menu");
            System.out.println("---------------");
            System.out.println("1. Create OneWayTicket");
            System.out.println("2. Create Flight (Book flight");
            System.out.println("5. exit");
            System.out.print("Enter Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            
            switch (choice) {
                case 1:
                    System.out.print("NOTE: this is a GUI interface test");
                    System.out.print("\nEnter TicketID: ");
                    int newID = scanner.nextInt();
                    scanner.nextLine();
        
                    System.out.print("Enter User ID: ");
                    int newUserID = scanner.nextInt();

                    String newName = "TestName: ";
                    String newComment = "TestComment: ";
                    
                    OneWayTicket newBooking = new OneWayTicket(newID, newUserID, newName, newComment);
                    tickets.add(newBooking);
                    break;
                case 2:
                    System.out.print("Departure: ");
                    String departure = scanner.nextLine();
                    
                    System.out.print("Arrival: ");
                    String destination = scanner.nextLine();
   
                    System.out.print("Departure Year: ");
                    int year1 = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Departure Month: ");
                    int month1 = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Departure Day: ");
                    int day1 = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Arrival Year: ");
                    int year2 = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Arrival Month: ");
                    int month2 = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Arrival Day: ");
                    int day2 = scanner.nextInt();
                    scanner.nextLine();
                    
                    Flight testFlight = new Flight(departure, destination, new MyDate(year1, month1, day1), new MyDate(year2, month2, day2));
                    flights.add(testFlight);
                    System.out.print(testFlight.toString());
                case 5:
                default: 
            }
        } 
        */
        
    }
}
