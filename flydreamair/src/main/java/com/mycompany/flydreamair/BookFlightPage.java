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
        
        /* // [Callum] Not working yet, trying to create Array
        labels[0] = jLabel7;
        
        LabelMouseListener listener = new LabelMouseListener(textField);
        
        for (JLabel label : labels) {
            label.addMouseListener(listener);
        }
        */
        
        
        /*
        for (int i = 0; i<labels.length; i++) {
            jLabel7.add
            labels[i].addMouseListener(listener);
        }
        */
        
        /*
        String aus1 = "Sydney";
        travel.add(aus1);
        
        String[] initialItems = {"Sydney (SYD)", "Brisbane (BNE)"};
        jComboBox1.setModel(new DefaultComboBoxModel<>(initialItems));
        */
  
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
        flyFromTextbox = new javax.swing.JTextField();
        bookFlightNextButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        flyToTextbox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        countryTravel = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        sAusLabel = new javax.swing.JLabel();
        sydney = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Fly Dream Air");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 17, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fly from");

        flyFromTextbox.setBackground(new java.awt.Color(0, 153, 204));
        flyFromTextbox.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        flyFromTextbox.setText("Airport/city");
        flyFromTextbox.setBorder(null);

        bookFlightNextButton.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        bookFlightNextButton.setForeground(new java.awt.Color(102, 102, 102));
        bookFlightNextButton.setText("Next ");
        bookFlightNextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookFlightNextButtonMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fly to");

        flyToTextbox.setBackground(new java.awt.Color(0, 153, 204));
        flyToTextbox.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        flyToTextbox.setText("somewhere");
        flyToTextbox.setBorder(null);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sAusLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        sAusLabel.setText("S");
        jPanel3.add(sAusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

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
        jPanel3.add(sydney, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setText("A");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel9.setText("Adelaide (ADL)");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel10.setText("Arimdale (ARM)");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel11.setText("B");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel14.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel14.setText("Brisbane (BNE)");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel7.setText("C");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 20, -1));

        jLabel15.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel15.setText("Cairns (CNS)");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel17.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel17.setText("Canberra (CBR)");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel18.setText("D");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel19.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel19.setText("Darwin (DRW)");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel20.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel20.setText("G");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel21.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel21.setText("Gold Coast (OOL)");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel24.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel24.setText("M");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jLabel25.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel25.setText("Melbourne (MEL)");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setText("P");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel12.setText("Perth (PER)");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel13.setText("W");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabel26.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel26.setText("Wollongong (WOL)");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        jLabel27.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel27.setText("Dubbo (DBO)");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

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
        jLabel29.setText("Hiroshima");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel30.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        jLabel30.setText("S");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

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
        countryTravel.addTab("North America", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bookFlightNextButton)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(flyFromTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flyToTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(68, 68, 68))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(countryTravel, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flyToTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flyFromTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(countryTravel, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(bookFlightNextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 63, 950, 640));

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

    
    private void bookFlightNextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookFlightNextButtonMouseClicked
        /*
        String departureCity = flyFromTextbox.getText();

        String arrivalCity = flyToTextbox.getText();

        String depYear = departureYear.getText();
        int departYear = Integer.parseInt(depYear);

        String depMoth = departureMonth.getText();
        int departMonth = Integer.parseInt(depMoth);

        String depDay = departureMonth.getText();
        int departDay = Integer.parseInt(depDay);

        String arYear = arrivalYear.getText();
        int arrivalYear = Integer.parseInt(arYear);

        String arMonth = arrivalMonth.getText();
        int arrivalMonth = Integer.parseInt(arMonth);

        String arDay = arrivalDay.getText();
        int arrivalDay = Integer.parseInt(arDay);

        LocalDateTime userDepDate = LocalDateTime.of(departYear, departMonth, departDay, 0,0,0);
        LocalDateTime userArrDate = LocalDateTime.of(arrivalYear, arrivalMonth, arrivalDay, 0,0,0);

        String seat = seatBooking.getText();

        Flight newFlight = new Flight(departureCity, arrivalCity, userDepDate, userArrDate, 100, seat);

        flights.add(newFlight);

        System.out.print(newFlight.toString());
        */
        
    }//GEN-LAST:event_bookFlightNextButtonMouseClicked

    // [CH] Mouse functiions, lots to do
    
    // Sydney (SYD)
    private void sydneyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sydneyMouseClicked
        if (evt.getButton() == evt.BUTTON1) {
            flyFromTextbox.setText("Sydney");
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
            flyFromTextbox.setText("Tokyo");
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
            flyFromTextbox.setText("Phuket");
        }
    }//GEN-LAST:event_jLabel35MouseClicked

   
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
    private javax.swing.JButton bookFlightNextButton;
    private javax.swing.JTabbedPane countryTravel;
    private javax.swing.JTextField flyFromTextbox;
    private javax.swing.JTextField flyToTextbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
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
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel sydney;
    // End of variables declaration//GEN-END:variables
}
