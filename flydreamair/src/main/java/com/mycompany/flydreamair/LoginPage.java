package com.mycompany.flydreamair;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class LoginPage extends javax.swing.JFrame {
    private static JFrame mainFrame;
    private static JFrame accountCreationFrame;
    private ArrayList<User> customers;
    
    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();

        this.setLocationRelativeTo(null); // [CH] Center window
        LoginPanel.requestFocusInWindow(); // [CH] Take mouse focus off inputs (show placeholders)
        createButton.setVisible(false);
        emailField.setVisible(false);
        
        customers = new ArrayList<>(); 
    }
    
    public ArrayList<User> getCustomers() {
        return customers;
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
        createButton = new javax.swing.JButton();
        signupButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        usernameLogin = new javax.swing.JTextField();
        passwordLogin = new javax.swing.JPasswordField();
        emailField = new javax.swing.JTextField();
        LoginPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 500));
        jPanel1.setSize(new java.awt.Dimension(720, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createButton.setText("Create account");
        createButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createButtonMouseClicked(evt);
            }
        });
        jPanel1.add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, -1, -1));

        signupButton.setText("Sign up");
        signupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupButtonMouseClicked(evt);
            }
        });
        jPanel1.add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 220, 160));

        loginButton.setBackground(new java.awt.Color(110, 102, 153));
        loginButton.setText("Login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 110, 40));

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

        passwordLogin.setForeground(new java.awt.Color(102, 102, 102));
        passwordLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordLogin.setText("Password");
        passwordLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        passwordLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordLoginFocusLost(evt);
            }
        });
<<<<<<< Updated upstream
        userPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(userPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 240, 50));
=======
        jPanel1.add(passwordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 240, 50));
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 240, 40));
>>>>>>> Stashed changes

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
   
    private void passwordLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordLoginFocusGained
        if (passwordLogin.getText().equals("Password")) {
            passwordLogin.setText("");
            passwordLogin.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_passwordLoginFocusGained

    private void passwordLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordLoginFocusLost
        if (passwordLogin.getText().equals("")) {
            passwordLogin.setText("Password");
            passwordLogin.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_passwordLoginFocusLost
    // [CH] will change to saved users later
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
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
        //openMainPage();
   
    }//GEN-LAST:event_loginButtonActionPerformed
    
<<<<<<< Updated upstream
    private void openAccountCreation() {
        accountCreationFrame = new AccountCreation();
        accountCreationFrame.setSize(700,600);
        accountCreationFrame.setBackground(Color.gray);
        accountCreationFrame.setVisible(true);
    }
    
    private void accountCreationButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountCreationButtonMouseClicked
        openAccountCreation();
    }//GEN-LAST:event_accountCreationButtonMouseClicked

    private void userPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPasswordActionPerformed
=======
    private void signupButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupButtonMouseClicked
        //openAccountCreation();
        signupButton.setVisible(false);
        loginButton.setVisible(false);
        createButton.setVisible(true);
        emailField.setVisible(true);
    }//GEN-LAST:event_signupButtonMouseClicked

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        loginButton.setVisible(false);
        
        if (evt.getButton() == evt.BUTTON1) {
            String username = usernameLogin.getText();
            String password = passwordLogin.getText();

            boolean loginSuccess = false;
            for (User user : customers) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    loginSuccess = true;
                    break;
                }
            }

            if (loginSuccess) {
                openMainPage();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password!");
            }
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void createButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createButtonMouseClicked
       loginButton.setVisible(true);
       emailField.setVisible(false);
       signupButton.setVisible(true);
    }//GEN-LAST:event_createButtonMouseClicked
>>>>>>> Stashed changes
    
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
    private javax.swing.JButton createButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordLogin;
    private javax.swing.JButton signupButton;
    private javax.swing.JTextField usernameLogin;
    // End of variables declaration//GEN-END:variables
}
