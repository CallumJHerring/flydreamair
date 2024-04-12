package com.mycompany.flydreamair;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginPage extends javax.swing.JFrame {
    private static JFrame mainFrame;
    private static JFrame accountCreationFrame;
    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();

        this.setLocationRelativeTo(null); // [CH] Center window
        LoginPanel.requestFocusInWindow(); // [CH] Take mouse focus off inputs (show placeholders)
       
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
        accountCreationButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        usernameLogin = new javax.swing.JTextField();
        userPassword = new javax.swing.JPasswordField();
        LoginPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 500));
        jPanel1.setSize(new java.awt.Dimension(720, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountCreationButton.setText("Sign up");
        accountCreationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountCreationButtonMouseClicked(evt);
            }
        });
        jPanel1.add(accountCreationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 220, 160));

        jButton1.setBackground(new java.awt.Color(110, 102, 153));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 110, 40));

        usernameLogin.setForeground(new java.awt.Color(102, 102, 102));
        usernameLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameLogin.setText("Username");
        usernameLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        usernameLogin.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        usernameLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameLoginFocusLost(evt);
            }
        });
        jPanel1.add(usernameLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 240, 50));

        userPassword.setForeground(new java.awt.Color(102, 102, 102));
        userPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userPassword.setText("Password");
        userPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        userPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userPasswordFocusLost(evt);
            }
        });
        jPanel1.add(userPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 240, 50));

        LoginPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginImage.png"))); // NOI18N
        LoginPanel.setText("C");
        jPanel1.add(LoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void usernameLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameLoginFocusGained
        if (usernameLogin.getText().equals("Username")) {
            usernameLogin.setText("");
            usernameLogin.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_usernameLoginFocusGained

    private void usernameLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameLoginFocusLost
        if (usernameLogin.getText().equals("")) {
            usernameLogin.setText("Username");
            usernameLogin.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_usernameLoginFocusLost
   
    private void userPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPasswordFocusGained
        if (userPassword.getText().equals("Password")) {
            userPassword.setText("");
            userPassword.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_userPasswordFocusGained

    private void userPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPasswordFocusLost
        if (userPassword.getText().equals("")) {
            userPassword.setText("Password");
            userPassword.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_userPasswordFocusLost
    // [CH] will change to saved users later
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /* [CH] sick of typing credentials in 
        if (usernameLogin.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter username");
        } else if (userPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter password");
        } else if (usernameLogin.getText().equals("user") && userPassword.getText().equals("password")) {
            //JOptionPane.showMessageDialog(null, "Login Success!");
            openMainPage();
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect login details!","System Error",JOptionPane.ERROR_MESSAGE);
        }
        */
        openMainPage();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void openAccountCreation() {
        accountCreationFrame = new AccountCreation();
        accountCreationFrame.setSize(700,600);
        accountCreationFrame.setBackground(Color.gray);
        accountCreationFrame.setVisible(true);
    }
    
    private void accountCreationButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountCreationButtonMouseClicked
        openAccountCreation();
    }//GEN-LAST:event_accountCreationButtonMouseClicked
    
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override // added override [CH]
            public void run() {
                new LoginPage().setVisible(true);
                
                
            }
        });
    }
    
    private void openMainPage() {
        mainFrame = new MainPage();
        mainFrame.setSize(1920,1080);
        mainFrame.setBackground(Color.gray);
        mainFrame.setVisible(true);

        // Close the login frame 
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginPanel;
    private javax.swing.JButton accountCreationButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField userPassword;
    private javax.swing.JTextField usernameLogin;
    // End of variables declaration//GEN-END:variables
}
