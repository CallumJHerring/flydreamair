package com.mycompany.flydreamair;

import java.io.*;

public class Flight implements Serializable {
    
    public String flyFrom;
    public String flyTo;
    public MyDate departureDate;
    public MyDate arrivalDate;
    
    public Flight(String flyFrom, String flyTo, MyDate departureDate, MyDate arrivalDate) {
        this.flyFrom = flyFrom;
        this.flyTo = flyTo;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Airport Departing: ").append(this.flyFrom).append("\n");
        sb.append("Airport Destination: ").append(this.flyTo).append("\n");
        sb.append("Departure Date: ").append(this.departureDate.toString()).append("\n");
        sb.append("Arrival Date: ").append(this.arrivalDate.toString()).append("\n");
        return sb.toString();
    }
    
}
