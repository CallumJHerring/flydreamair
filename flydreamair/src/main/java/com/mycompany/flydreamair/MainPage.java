package com.mycompany.flydreamair;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.*;

public class MainPage extends javax.swing.JFrame {
    private JFrame bookFrame;
    private JFrame accountFrame;
    private JFrame reservationFrame;

    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();
        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formatDate = now.format(formatter);
        dateBox.setText(formatDate);
     
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateBox = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bookFlightLabel = new javax.swing.JLabel();
        manageReservation = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        facebook = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        instagram = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        linkedIn = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        logoutButton = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fly Dream Air");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 23, -1, -1));

        jLabel2.setFont(new java.awt.Font("Zapfino", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("\"The sky is not the limit, its just the beginning\"");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 85, -1, -1));

        dateBox.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        dateBox.setForeground(new java.awt.Color(255, 255, 255));
        dateBox.setText("Date:");
        jPanel2.add(dateBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 214, 27));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1462, 140));

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookFlightLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        bookFlightLabel.setForeground(new java.awt.Color(255, 255, 255));
        bookFlightLabel.setText("Book Flight");
        bookFlightLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookFlightLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookFlightLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookFlightLabelMouseExited(evt);
            }
        });
        jPanel3.add(bookFlightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 42, -1, -1));

        manageReservation.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        manageReservation.setForeground(new java.awt.Color(255, 255, 255));
        manageReservation.setText("Manage Reservation");
        manageReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageReservationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageReservationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageReservationMouseExited(evt);
            }
        });
        jPanel3.add(manageReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 42, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Manage Seating");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 42, -1, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("In-Flight Services");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 42, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1460, -1));

        jLabel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 12, 1470, 80));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokyo.jpeg"))); // NOI18N
        jLabel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, 280));

        jLabel18.setFont(new java.awt.Font("Georgia", 2, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("World of Wonders!");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, -1, -1));

        jLabel23.setFont(new java.awt.Font("Georgia", 2, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Tokyo, Japan");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, -1));

        jLabel28.setFont(new java.awt.Font("Georgia", 2, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("A Colletion Of Our Recent Trips");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        jLabel29.setFont(new java.awt.Font("Georgia", 2, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Wuhan, China");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 110, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wuhan (1).jpeg"))); // NOI18N
        jLabel30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 490, 280));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alaska (1).png"))); // NOI18N
        jLabel32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 190, 470, 280));

        jLabel31.setFont(new java.awt.Font("Georgia", 2, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Alaska, USA");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 160, 90, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1460, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ease of use to our customers. We aim to bring next");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("level modern user interface with our software");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel14.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("providing customers the ability to easily navigate");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel15.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("through our services.");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("team passionate in providing comfort, safety and");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("vision to enhance air travel, Fly Dream Air brings together a");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("the beginning to endless possibilities. Established with a");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("connecting people through our defined services encouraging");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("At Fly Dream Air, we believe in elevating experiences and");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("About Us");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 90, 20));

        jLabel17.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Contact Us");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, -1));

        facebook.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        facebook.setForeground(new java.awt.Color(255, 255, 255));
        facebook.setText("Facebook");
        facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facebookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facebookMouseExited(evt);
            }
        });
        jPanel4.add(facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fb (1).png"))); // NOI18N
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 70, 50));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instagram-removebg-preview (1).png"))); // NOI18N
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 80, -1));

        instagram.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        instagram.setForeground(new java.awt.Color(255, 255, 255));
        instagram.setText("Instagram");
        instagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instagramMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                instagramMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                instagramMouseExited(evt);
            }
        });
        jPanel4.add(instagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linkedin-removebg-preview (1) (1).png"))); // NOI18N
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 60, 50));

        linkedIn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        linkedIn.setForeground(new java.awt.Color(255, 255, 255));
        linkedIn.setText("LinkedIn");
        linkedIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkedInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkedInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                linkedInMouseExited(evt);
            }
        });
        jPanel4.add(linkedIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/click-removebg-preview (1).png"))); // NOI18N
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/click-removebg-preview (1).png"))); // NOI18N
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/click-removebg-preview (1).png"))); // NOI18N
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appstore-removebg-preview (1).png"))); // NOI18N
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 50, -1, 120));

        jLabel33.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("Download our app");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, -1, -1));

        jLabel35.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("Support");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, -1));

        jLabel36.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Help centre");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel36MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel36MouseExited(evt);
            }
        });
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, -1, -1));

        jLabel37.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Travel Credits information");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel37MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel37MouseExited(evt);
            }
        });
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, -1));

        jLabel38.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Contact us");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel38MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel38MouseExited(evt);
            }
        });
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, -1, -1));

        jLabel39.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Legal");
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel39MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel39MouseExited(evt);
            }
        });
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, -1));

        jLabel40.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Careers");
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel40MouseExited(evt);
            }
        });
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, -1));

        jLabel41.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("Other services");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, -1));

        jLabel43.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Travel agents");
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel43MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel43MouseExited(evt);
            }
        });
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, -1, -1));

        jLabel44.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Car hire and hotel deals");
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel44MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel44MouseExited(evt);
            }
        });
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, -1, -1));

        jLabel45.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Group bookings");
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel45MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel45MouseExited(evt);
            }
        });
        jPanel4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 130, -1, -1));

        jLabel46.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Travel insurance");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel46MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel46MouseExited(evt);
            }
        });
        jPanel4.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, -1, -1));

        jLabel47.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(204, 204, 204));
        jLabel47.setText("© FlyDreamAir Australia Airlines Pty Ltd ABN 36 845 162 377");
        jPanel4.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 200, -1, -1));

        jLabel48.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 51));
        jLabel48.setText("(Coming soon)");
        jPanel4.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 30, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1460, 230));

        logoutButton.setText("Logout");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        jMenuBar1.add(logoutButton);

        jMenu1.setText("Account");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // [CH] Log user out of main page
    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        dispose();
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked
    
    // [CH] Change color of Text so user knows what they are selecting
    private void bookFlightLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookFlightLabelMouseEntered
        bookFlightLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_bookFlightLabelMouseEntered

    private void bookFlightLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookFlightLabelMouseExited
        bookFlightLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_bookFlightLabelMouseExited
    
    // [CH] Open BookFlightPage.java
    private void bookFlightLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookFlightLabelMouseClicked
        if (evt.getButton() == evt.BUTTON1) {
            //new BookFlightPage().setVisible(true);
            bookFrame = new BookFlightPage();
            bookFrame.setSize(1920,1080);
            bookFrame.setVisible(true);
        }
    }//GEN-LAST:event_bookFlightLabelMouseClicked

    private void facebookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseEntered
        facebook.setForeground(Color.BLACK);
    }//GEN-LAST:event_facebookMouseEntered

    private void facebookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseExited
        facebook.setForeground(Color.WHITE);
    }//GEN-LAST:event_facebookMouseExited

    private void instagramMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagramMouseEntered
        instagram.setForeground(Color.BLACK);
    }//GEN-LAST:event_instagramMouseEntered

    private void instagramMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagramMouseExited
        instagram.setForeground(Color.WHITE);
    }//GEN-LAST:event_instagramMouseExited

    private void linkedInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkedInMouseEntered
        linkedIn.setForeground(Color.BLACK);
    }//GEN-LAST:event_linkedInMouseEntered

    private void linkedInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkedInMouseExited
        linkedIn.setForeground(Color.WHITE);
    }//GEN-LAST:event_linkedInMouseExited

    private void facebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseClicked
        if (evt.getButton() == evt.BUTTON1) {
            JOptionPane.showMessageDialog(null, "www.facebook.com/flydreamairaustralia", "Social Media", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_facebookMouseClicked

    private void instagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagramMouseClicked
        if (evt.getButton() == evt.BUTTON1) {
            JOptionPane.showMessageDialog(null, "www.instagram.com/flydreamairaustralia", "Social Media", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_instagramMouseClicked

    private void linkedInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkedInMouseClicked
        if (evt.getButton() == evt.BUTTON1) {
            JOptionPane.showMessageDialog(null, "www.linkedin.com/flydreamairaustralia", "Social Media", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_linkedInMouseClicked

    private void jLabel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseEntered
        jLabel36.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel36MouseEntered

    private void jLabel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseExited
        jLabel36.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel36MouseExited

    private void jLabel37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseEntered
        jLabel37.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel37MouseEntered

    private void jLabel37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseExited
         jLabel37.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel37MouseExited

    private void jLabel38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseEntered
         jLabel38.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel38MouseEntered

    private void jLabel38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseExited
         jLabel38.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel38MouseExited

    private void jLabel40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseEntered
         jLabel40.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel40MouseEntered

    private void jLabel40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseExited
         jLabel40.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel40MouseExited

    private void jLabel39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseEntered
         jLabel39.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel39MouseEntered

    private void jLabel39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseExited
         jLabel39.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel39MouseExited

    private void jLabel46MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseEntered
         jLabel46.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel46MouseEntered

    private void jLabel46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseExited
         jLabel46.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel46MouseExited

    private void jLabel43MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseEntered
         jLabel43.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel43MouseEntered

    private void jLabel43MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseExited
         jLabel43.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel43MouseExited

    private void jLabel44MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseEntered
         jLabel44.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel44MouseEntered

    private void jLabel44MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseExited
         jLabel44.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel44MouseExited

    private void jLabel45MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseEntered
          jLabel45.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel45MouseEntered

    private void jLabel45MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseExited
         jLabel45.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel45MouseExited
    
    public void openManageReservation() {
        reservationFrame = new ReservationManagement();
        reservationFrame.setVisible(true);
        reservationFrame.setSize(1000,800);
    }
    
    public void openAccountPage() {
        accountFrame = new AccountInformation();
        accountFrame.setVisible(true);
        accountFrame.setSize(1920,1080);
    }
    
    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
       if (evt.getButton() == evt.BUTTON1) {
            openAccountPage();
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void manageReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageReservationMouseClicked
        if (evt.getButton() == evt.BUTTON1) {
            openManageReservation();
        }
    }//GEN-LAST:event_manageReservationMouseClicked

    private void manageReservationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageReservationMouseEntered
        manageReservation.setForeground(Color.BLACK);
    }//GEN-LAST:event_manageReservationMouseEntered

    private void manageReservationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageReservationMouseExited
        manageReservation.setForeground(Color.WHITE);
    }//GEN-LAST:event_manageReservationMouseExited

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookFlightLabel;
    private javax.swing.JLabel dateBox;
    private javax.swing.JLabel facebook;
    private javax.swing.JLabel instagram;
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
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel linkedIn;
    private javax.swing.JMenu logoutButton;
    private javax.swing.JLabel manageReservation;
    // End of variables declaration//GEN-END:variables
}
