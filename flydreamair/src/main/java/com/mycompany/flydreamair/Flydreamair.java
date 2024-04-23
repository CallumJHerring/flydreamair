package com.mycompany.flydreamair;

import java.util.*;
import java.io.*;
import java.time.*;

public class Flydreamair implements Serializable {

    public static void main(String[] args) {
        // [CH] Opens application, comment these lines out if you want to stop the GUI loading
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        
        // [CH] Test User object and Ticket types
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Ticket> tickets = new ArrayList<>();
        ArrayList<Flight> flights = new ArrayList<>();
        
        LocalDateTime depTime = LocalDateTime.of(2024,4,16,5,30);
        LocalDateTime arrTime = LocalDateTime.of(2024,4,16,15,30);
      
        User user1 = new User("Callum Herring", "password1", "callumjh@uow.edu.au");
        Flight flight1 = new Flight("Sydney", "Brisbane", depTime, arrTime, 100, "B12");
        Ticket ticket1 = new Ticket(user1, flight1);
        
        users.add(user1);
        flights.add(flight1);
        tickets.add(ticket1);
        System.out.println("Ticket Details: \n" + ticket1.toString());
        
        //System.out.println("Users: \n" + user1.toString());
        //System.out.println("Flights: \n" + flight1.toString());
        //FlightSerializer.readFlightsFile();
        
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
