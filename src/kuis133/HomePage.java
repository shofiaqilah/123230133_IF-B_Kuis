/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis133;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Lab Informatika
 */
public class HomePage extends JFrame implements ActionListener{
    
    JLabel welcome = new JLabel();
    JLabel apel = new JLabel("Apel (Rp 15.000/kg)");
    JTextField apelField = new JTextField();
    JLabel jeruk = new JLabel("Jeruk (Rp 15.000/kg)");
    JTextField jerukField = new JTextField();
    JLabel mangga = new JLabel("Mangga (Rp 15.000/kg)");
    JTextField manggaField = new JTextField();
    JButton beli = new JButton("Beli");
    JButton logout = new JButton("Logout");
    private int hargaApel, hargaJeruk, hargaMangga;
    private boolean isNumeric;
    
    public HomePage(String username){
        this.hargaApel = hargaApel;
        this.hargaJeruk = hargaJeruk;
        this.hargaMangga = hargaMangga;
        
        setSize(400, 500);
        setLayout(null);
        setTitle("Halaman Utama");
        
        add(welcome);
        welcome.setText("Selamat Datang " + username);
        welcome.setBounds(50, 50, 300, 30);
        
        add(apel);
        apel.setBounds(50, 80, 300, 30);
        add(apelField);
        apelField.setBounds(200, 80, 100, 30);
        apelField.setText("0");
        
        add(jeruk);
        jeruk.setBounds(50, 110, 300, 30);
        add(jerukField);
        jerukField.setBounds(200, 110, 100, 30);
        jerukField.setText("0");
        
        add(mangga);
        mangga.setBounds(50, 140, 300, 30);
        add(manggaField);
        manggaField.setBounds(200, 140, 100, 30);
        manggaField.setText("0");
        
        add(beli);
        beli.setBounds(50, 200, 275, 30);
        beli.addActionListener(this);
        
        add(logout);
        logout.setBounds(50, 240, 275, 30);
        logout.addActionListener(this);
        
        setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource() == beli){
                int hargaApel = 15000;
                int hargaJeruk = 12000;
                int hargaMangga = 20000;
                
                int jumlahApel = Integer.parseInt(apelField.getText());
                int jumlahJeruk = Integer.parseInt(jerukField.getText());
                int jumlahMangga = Integer.parseInt(manggaField.getText());
                
                int totalhargaApel = hargaApel*jumlahApel;
                int totalhargaJeruk = hargaJeruk*jumlahJeruk;
                int totalhargaMangga = hargaMangga*jumlahMangga;
                
                new PurchacePage("shofi", totalhargaApel, totalhargaJeruk, totalhargaMangga, 15000, 12000, 20000, jumlahApel, jumlahJeruk, jumlahMangga);
                this.dispose();
            } else if (e.getSource() == logout){
                this.dispose();
            }
        } catch(Exception error) {
        
        }
    }
}
