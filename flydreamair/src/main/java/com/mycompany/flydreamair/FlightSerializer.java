package com.mycompany.flydreamair;

import java.io.*;
import java.time.*;
import java.util.*;

// [CH] Not working, error at Index 11 'T' in txt file.
public class FlightSerializer implements Serializable {
    
    /*
    public static void readFlightsFile() {
        try {
            ArrayList<Flight> flights = new ArrayList<>();
            String fileName = "/Users/callum/Desktop/flights.txt";
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
        
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String departureCity = parts[0].trim();
                String arrivalCity = parts[1].trim();
                //String departureDate = (parts[2].trim().replace('T', ' '));
                //String arrivalDate = (parts[3].trim().replace('T', ' '));
                //System.out.println("Dep Date: " + departureDate);
                //System.out.println("Arr Date: " + arrivalDate);
                LocalDateTime depDate = LocalDateTime.parse(parts[2].trim());
                LocalDateTime arrDate = LocalDateTime.parse(parts[3].trim());
                double price = Double.parseDouble(parts[4].trim());
                String seat = parts[5].trim();
            
                Flight flight = new Flight(departureCity, arrivalCity, depDate, arrDate, price, seat);
                //flights.add(flight);
                System.out.println("Flight File: " + flight);
            }
            reader.close();    
        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }
    */
}
