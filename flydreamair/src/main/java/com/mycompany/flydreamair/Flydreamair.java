package com.mycompany.flydreamair;

import java.util.*;

public class Flydreamair implements CompanyFileIO {

    public static void main(String[] args) {
        // [CH] Opens application, comment these lines out if you want to stop the GUI loading
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true); 
    }
    
    public void writeData(Formatter format) {
        
    }
}
