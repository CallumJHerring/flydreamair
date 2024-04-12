package com.mycompany.flydreamair;

import java.io.*;

public class MyDate implements Serializable {
    public int year;
    public int month;
    public int day;
    
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    /*
    public String toDelimitedString() {
        return year + "/" + month + "/" + day;
    }
    */
    
    @Override
    public String toString() {
        return year + "/" + month + "/" + day;
    }  
}
