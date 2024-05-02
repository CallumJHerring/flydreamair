package com.mycompany.flydreamair;

import java.awt.Color;
import java.util.*;
import java.io.*;
import java.time.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BookFlightPage extends javax.swing.JFrame {
    private ArrayList<Flight> flights = new ArrayList<>();
    private static JFrame bookFlightFrame;
    private ArrayList<String> travel = new ArrayList<>();
    
    private JTextField textField;
    private JLabel[] labels = new JLabel[40];
    
    /**
     * Creates new form BookFlightPage
     */
    public BookFlightPage() {
        initComponents();
        jPanel2.requestFocusInWindow();
        loadFlights();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        departureCity = new javax.swing.JTextField();
        createBooking = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        arrivalCity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        countryTravel = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        sAusLabel = new javax.swing.JLabel();
        sydney = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Atlanta = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Austin = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        Boston = new javax.swing.JLabel();
        Chicago = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        Cleverland = new javax.swing.JLabel();
        Columbus = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        Dallas = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        LasVegas = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        departureDate = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        arrivalDate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        seating = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book your holiday with Fly Dream Air");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 17, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fly from");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        departureCity.setBackground(new java.awt.Color(0, 153, 204));
        departureCity.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        departureCity.setText("Airport/city");
        departureCity.setBorder(null);
        jPanel2.add(departureCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 270, 49));

        createBooking.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        createBooking.setForeground(new java.awt.Color(255, 255, 255));
        createBooking.setText("Create booking");
        createBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createBookingMouseClicked(evt);
            }
        });
        jPanel2.add(createBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 580, -1, 33));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 102, 370, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fly to");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        arrivalCity.setBackground(new java.awt.Color(0, 153, 204));
        arrivalCity.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        arrivalCity.setText("somewhere");
        arrivalCity.setBorder(null);
        jPanel2.add(arrivalCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 280, 49));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 102, 370, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sAusLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        sAusLabel.setText("S");
        jPanel3.add(sAusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        sydney.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        sydney.setText("Sydney (SYD)");
        sydney.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sydneyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sydneyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sydneyMouseExited(evt);
            }
        });
        jPanel3.add(sydney, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setText("A");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel9.setText("Adelaide (ADL)");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel11.setText("B");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel14.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel14.setText("Brisbane (BNE)");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel7.setText("C");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 20, -1));

        jLabel17.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel17.setText("Canberra (CBR)");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel20.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel20.setText("G");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel21.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel21.setText("Gold Coast (OOL)");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel24.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel24.setText("M");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel25.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel25.setText("Melbourne (MEL)");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setText("P");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel12.setText("Perth (PER)");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel13.setText("W");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel26.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel26.setText("Wollongong (WOL)");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        countryTravel.addTab("Australia", jPanel3);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        jLabel16.setText("I");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 50, -1));

        jLabel22.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel22.setText("Indira Gandhi (DEL)");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jLabel23.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel23.setText("Icheon (ICN)");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel28.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        jLabel28.setText("H");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel29.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Hiroshima");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel31.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel31.setText("Singapore");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jLabel32.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        jLabel32.setText("T");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel33.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel33.setText("Tokyo (HND)");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel33MouseExited(evt);
            }
        });
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabel34.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        jLabel34.setText("P");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        jLabel35.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel35.setText("Phuket (HKT)");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel35MouseExited(evt);
            }
        });
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jLabel36.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel36.setText("Beijing");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel37.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        jLabel37.setText("B");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        countryTravel.addTab("Asia Pacific", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Atlanta.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        Atlanta.setText("Atlanta (ATL)");
        Atlanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtlantaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AtlantaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AtlantaMouseExited(evt);
            }
        });
        jPanel6.add(Atlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel38.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel38.setText("A");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        Austin.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        Austin.setText("Austin (AUS)");
        Austin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AustinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AustinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AustinMouseExited(evt);
            }
        });
        jPanel6.add(Austin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel39.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel39.setText("B");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        Boston.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        Boston.setText("Boston (BOS)");
        Boston.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BostonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BostonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BostonMouseExited(evt);
            }
        });
        jPanel6.add(Boston, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        Chicago.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        Chicago.setText("Chicago (ORD)");
        Chicago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChicagoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChicagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChicagoMouseExited(evt);
            }
        });
        jPanel6.add(Chicago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel42.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel42.setText("C");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        Cleverland.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        Cleverland.setText("Cleverland (CLE)");
        Cleverland.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CleverlandMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CleverlandMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CleverlandMouseExited(evt);
            }
        });
        jPanel6.add(Cleverland, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        Columbus.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        Columbus.setText("Columbus (CMH)");
        Columbus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ColumbusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ColumbusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ColumbusMouseExited(evt);
            }
        });
        jPanel6.add(Columbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel43.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel43.setText("D");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        Dallas.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        Dallas.setText("Dallas/Fort Worth (DFW)");
        Dallas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DallasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DallasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DallasMouseExited(evt);
            }
        });
        jPanel6.add(Dallas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel44.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel44.setText("L");
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        LasVegas.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LasVegas.setText("Las Vegas (LAS)");
        jPanel6.add(LasVegas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        countryTravel.addTab("North America", jPanel6);

        jPanel2.add(countryTravel, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 140, 744, 311));

        jLabel30.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Date");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        departureDate.setBackground(new java.awt.Color(0, 153, 204));
        departureDate.setText("DD/MM/YYYY");
        departureDate.setBorder(null);
        jPanel2.add(departureDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 63, 110, 40));

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("⮕");
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 40, 60));

        jLabel46.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Date");
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        arrivalDate.setBackground(new java.awt.Color(0, 153, 204));
        arrivalDate.setText("DD/MM/YYY");
        arrivalDate.setBorder(null);
        jPanel2.add(arrivalDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 90, 40));

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Seating");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, -1, -1));

        seating.setText("Select seat (A2)");
        jPanel2.add(seating, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, -1, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 63, 1350, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void createBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createBookingMouseClicked
        try {
            newFlight();
            JOptionPane.showMessageDialog(null, "Flight created successfully");
        } catch (Exception e) {
            
        } 
    }//GEN-LAST:event_createBookingMouseClicked

    public void loadFlights() {
        try {
            Scanner file = new Scanner(new File("/Users/callum/Desktop/flights.txt"));
            while (file.hasNextLine()) {
                String line = file.nextLine();
                Flight flight = parseFlights(line);
                flights.add(flight);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Flight parseFlights(String line) {
        try {
            String[] parts = line.split(",");
            String departureCity = parts[0].trim();
            String departureDate = parts[1].trim();
            String arrivalCity = parts[2].trim();
            String arrivalDate = parts[3].trim();
            String price = parts[4].trim();
            String seat = parts[5].trim();
            return new Flight(departureCity, departureDate, arrivalCity, arrivalDate, price, seat);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void displayFlights() {
        for (Flight f: flights) {
            System.out.println(f);
        }
    }
    
    public void newFlight() {
        try {
            String depCity = departureCity.getText();
            String depDate = departureDate.getText();
            String arrCity = arrivalCity.getText();
            String arrDate = arrivalDate.getText();
            String price = "TBD";
            String seat = seating.getText();
            
            Flight newFlight = new Flight(depCity, depDate, arrCity, arrDate, price, seat);
            flights.add(newFlight);
            
            if (newFlight != null) {
                writeFlights();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void writeFlights() {
        String fileName = "/Users/callum/Desktop/flights.txt";
        try {
            Formatter fout = new Formatter(fileName);
            for (Flight f: flights) {
                f.writeData(fout);
            }
            fout.close();
        } catch (Exception e) {
            
        }
    }
    
    // [CH] Mouse functions, lots to do
    // Sydney (SYD)
    private void sydneyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sydneyMouseClicked
        if (evt.getButton() == evt.BUTTON1) {
            departureCity.setText("Sydney");
        }
    }//GEN-LAST:event_sydneyMouseClicked

    private void sydneyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sydneyMouseEntered
        sydney.setForeground(Color.GREEN); // [Callum] change color later
    }//GEN-LAST:event_sydneyMouseEntered

    private void sydneyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sydneyMouseExited
        sydney.setForeground(Color.BLACK);
    }//GEN-LAST:event_sydneyMouseExited

    private void jLabel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseEntered
        jLabel33.setForeground(Color.GREEN); //tokyo
    }//GEN-LAST:event_jLabel33MouseEntered

    private void jLabel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseExited
        jLabel33.setForeground(Color.BLACK); //tokyo
    }//GEN-LAST:event_jLabel33MouseExited

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        if (evt.getButton() == evt.BUTTON1) {
            departureCity.setText("Tokyo");
        }
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseEntered
        jLabel35.setForeground(Color.GREEN); //Phuket
    }//GEN-LAST:event_jLabel35MouseEntered

    private void jLabel35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseExited
        jLabel35.setForeground(Color.BLACK); //Phuket
    }//GEN-LAST:event_jLabel35MouseExited

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        if (evt.getButton() == evt.BUTTON1) {
            departureCity.setText("Phuket");
        }
    }//GEN-LAST:event_jLabel35MouseClicked
        
    
    private void AtlantaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtlantaMouseExited
        // TODO add your handling code here:
        Atlanta.setForeground(Color.BLACK);
    }//GEN-LAST:event_AtlantaMouseExited

    private void AtlantaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtlantaMouseEntered
        // TODO add your handling code here:
        Atlanta.setForeground(Color.GREEN);
    }//GEN-LAST:event_AtlantaMouseEntered

    private void AtlantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtlantaMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == evt.BUTTON1) {
            departureCity.setText("Atlanta");
        }
    }//GEN-LAST:event_AtlantaMouseClicked

    
    private void AustinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AustinMouseEntered
        // TODO add your handling code here:
        Austin.setForeground(Color.GREEN);
        
    }//GEN-LAST:event_AustinMouseEntered

    private void AustinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AustinMouseExited
        // TODO add your handling code here:
        Austin.setForeground(Color.BLACK);
    }//GEN-LAST:event_AustinMouseExited

    private void AustinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AustinMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == evt.BUTTON1){
            departureCity.setText("Austin");
        }
    }//GEN-LAST:event_AustinMouseClicked

    private void BostonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BostonMouseEntered
        // TODO add your handling code here:
        Boston.setForeground(Color.GREEN);
    }//GEN-LAST:event_BostonMouseEntered

    private void BostonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BostonMouseExited
        // TODO add your handling code here:
        Austin.setForeground(Color.BLACK);
    }//GEN-LAST:event_BostonMouseExited

    private void BostonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BostonMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == evt.BUTTON1){
            departureCity.setText("Boston");
        }
    }//GEN-LAST:event_BostonMouseClicked

    private void ChicagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChicagoMouseEntered
        // TODO add your handling code here:
        Chicago.setForeground (Color.GREEN);
    }//GEN-LAST:event_ChicagoMouseEntered

    private void ChicagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChicagoMouseExited
        // TODO add your handling code here:
        Chicago.setForeground(Color.BLACK);
    }//GEN-LAST:event_ChicagoMouseExited

    private void ChicagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChicagoMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == evt.BUTTON1){
            departureCity.setText("Chicago");
        }
    }//GEN-LAST:event_ChicagoMouseClicked

    private void CleverlandMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CleverlandMouseEntered
        // TODO add your handling code here:
        Cleverland.setForeground (Color.GREEN);
    }//GEN-LAST:event_CleverlandMouseEntered

    private void CleverlandMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CleverlandMouseExited
        // TODO add your handling code here:
        Cleverland.setForeground(Color.BLACK);
    }//GEN-LAST:event_CleverlandMouseExited

    private void CleverlandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CleverlandMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == evt.BUTTON1){
            departureCity.setText("Cleverland");
        }
    }//GEN-LAST:event_CleverlandMouseClicked

    private void ColumbusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColumbusMouseEntered
        // TODO add your handling code here:
        Columbus.setForeground(Color.GREEN);
    }//GEN-LAST:event_ColumbusMouseEntered

    private void ColumbusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColumbusMouseExited
        // TODO add your handling code here:
        Columbus.setForeground(Color.BLACK);
    }//GEN-LAST:event_ColumbusMouseExited

    private void ColumbusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ColumbusMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == evt.BUTTON1){
            departureCity.setText("Columbus"); 
        }
    }//GEN-LAST:event_ColumbusMouseClicked

    private void DallasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DallasMouseEntered
        // TODO add your handling code here:
        Dallas.setForeground(Color.GREEN);
    }//GEN-LAST:event_DallasMouseEntered

    private void DallasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DallasMouseExited
        // TODO add your handling code here:
        Dallas.setForeground(Color.BLACK);
    }//GEN-LAST:event_DallasMouseExited

    private void DallasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DallasMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == evt.BUTTON1){
            departureCity.setText("Dallas");
        }
           
    }//GEN-LAST:event_DallasMouseClicked
    /*    */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookFlightPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookFlightPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookFlightPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookFlightPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookFlightPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atlanta;
    private javax.swing.JLabel Austin;
    private javax.swing.JLabel Boston;
    private javax.swing.JLabel Chicago;
    private javax.swing.JLabel Cleverland;
    private javax.swing.JLabel Columbus;
    private javax.swing.JLabel Dallas;
    private javax.swing.JLabel LasVegas;
    private javax.swing.JTextField arrivalCity;
    private javax.swing.JTextField arrivalDate;
    private javax.swing.JTabbedPane countryTravel;
    private javax.swing.JButton createBooking;
    private javax.swing.JTextField departureCity;
    private javax.swing.JTextField departureDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel sAusLabel;
    private javax.swing.JTextField seating;
    private javax.swing.JLabel sydney;
    // End of variables declaration//GEN-END:variables
}
