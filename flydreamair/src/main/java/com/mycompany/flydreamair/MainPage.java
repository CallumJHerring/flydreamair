package com.mycompany.flydreamair;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.*;

public class MainPage extends javax.swing.JFrame {
    private static JFrame bookFlightFrame;
    private static JFrame accountCreationFrame;

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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        logoutButton = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Phosphate", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fly Dream Air");

        jLabel2.setFont(new java.awt.Font("Zapfino", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("\"The sky is not the limit, its just the beginning\"");

        dateBox.setText("Date:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(514, 514, 514)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dateBox, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dateBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1462, -1));

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

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Manage Reservation");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 42, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Manage Seating");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 42, -1, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("In-Flight Services");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 42, -1, -1));

        jLabel3.setText("About Us");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 440, 20));

        jLabel7.setText("jLabel7");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1460, -1));

        logoutButton.setText("Logout");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        jMenuBar1.add(logoutButton);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
            new BookFlightPage().setVisible(true);
        }
    }//GEN-LAST:event_bookFlightLabelMouseClicked
    
    private void openAccountCreation() {
        accountCreationFrame = new AccountCreation();
        accountCreationFrame.setSize(700,600);
        accountCreationFrame.setBackground(Color.gray);
        accountCreationFrame.setVisible(true);
    }
 
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenu logoutButton;
    // End of variables declaration//GEN-END:variables
}
