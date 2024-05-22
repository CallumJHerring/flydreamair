package com.mycompany.flydreamair;

import javax.swing.*;
import java.awt.*;
        
public class AccountInformation extends javax.swing.JFrame {

    /**
     * Creates new form AccountInformation
     */
    public AccountInformation() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jPanel4.requestFocusInWindow();
        
        usernameField.setEditable(false);
        passwordField.setEditable(false);
        emailField.setEditable(false);
        
        UserSession us = new UserSession();
        usernameField.setText(us.getCurrentUser().getUsername());
        passwordField.setText(us.getCurrentUser().getPassword());
        emailField.setText(us.getCurrentUser().getPassword());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        redDotOne = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        backLabel = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smallLogo.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 10, 250, 230));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Account Management");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Username");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Password");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel6.setText("Address");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Complete your account information");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        usernameField.setText("username");
        jPanel4.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 250, 40));

        passwordField.setText("password");
        jPanel4.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 250, 40));
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 510, 40));

        jLabel22.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel22.setText("Last name");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));
        jPanel4.add(firstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 230, 40));

        jLabel23.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel23.setText("Gender");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, -1, -1));
        jPanel4.add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 230, 40));

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Email");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel37.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 51, 51));
        jLabel37.setText("*");
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 10, -1));

        jLabel38.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 51, 51));
        jLabel38.setText("*");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 10, -1));

        jLabel39.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 51, 51));
        jLabel39.setText("*");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 10, -1));
        jPanel4.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 250, 40));

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Login details");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel40.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel40.setText("First name");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 100, 30));

        redDotOne.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        redDotOne.setForeground(new java.awt.Color(255, 51, 51));
        redDotOne.setText("*");
        jPanel4.add(redDotOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 10, -1));

        jLabel41.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 51, 51));
        jLabel41.setText("*");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 10, -1));

        jTabbedPane1.addTab("My Account", jPanel4);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Manage Payments");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel18.setText("Card number");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel19.setText("Expiry date");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel20.setText("CCV");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pay1-removebg-preview (1).png"))); // NOI18N
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));
        jPanel8.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 123, 250, 30));
        jPanel8.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 130, 30));
        jPanel8.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 90, 30));

        jTabbedPane1.addTab("Payment Method", jPanel8);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 1260, 660));

        backLabel.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        backLabel.setForeground(new java.awt.Color(0, 0, 0));
        backLabel.setText("Back");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backLabelMouseExited(evt);
            }
        });
        jPanel2.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back3-removebg-preview 2 (1).png"))); // NOI18N
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 880));

        jMenu2.setText("Logout");
        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void backLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseEntered
        backLabel.setForeground(new Color(128, 0, 0));
    }//GEN-LAST:event_backLabelMouseEntered

    private void backLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseExited
        backLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_backLabelMouseExited

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        if (evt.getButton() == evt.BUTTON1) {
            dispose();
        }
    }//GEN-LAST:event_backLabelMouseClicked

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
            java.util.logging.Logger.getLogger(AccountInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel redDotOne;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
