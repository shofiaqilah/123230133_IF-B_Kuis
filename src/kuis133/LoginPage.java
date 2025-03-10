/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis133;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener{
    JLabel usernamelLabel = new JLabel("Username: ");
    JLabel password = new JLabel("Password: ");
    JTextField userField = new JTextField();
    JTextField passField = new JTextField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    
    public LoginPage() {
        setSize(400, 500);
        setLayout(null);
        setTitle("Halaman login");
        
        add(usernamelLabel);
        add(password);
        add(userField);
        add(passField);
        add(loginButton);
        add(resetButton);
        
        usernamelLabel.setBounds(50, 100, 100, 30);
        password.setBounds(50, 140, 100,30);
        userField.setBounds(150, 100, 100,30);
        passField.setBounds(150, 140, 100,30);
        loginButton.setBounds(50, 210, 275,30);
        loginButton.addActionListener(this);
        resetButton.setBounds(50, 260, 275,30);
        resetButton.addActionListener(this);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     try {
         if(e.getSource() == loginButton){
             String username = userField.getText();
             String password = passField.getText();
             
             if(username.equals("shofi") && password.equals("123230133")){
             new HomePage(username);
             this.dispose();
             } else {
             JOptionPane.showMessageDialog(this,"Gagal Login!");
             }
         } else if (e.getSource() == resetButton){
             userField.setText("");
             passField.setText("");
         }
     } catch (Exception error) {
     JOptionPane.showMessageDialog(this, error.getMessage());}
    }
}
