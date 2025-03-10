/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis133;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class PurchacePage extends JFrame implements ActionListener{
    
    JLabel a = new JLabel();
    JLabel apel = new JLabel();
    JLabel jeruk = new JLabel();
    JLabel mangga = new JLabel();
    JLabel subtotal = new JLabel();
    JLabel pajak = new JLabel();
    JLabel totalharga = new JLabel();
    JButton back = new JButton("Kembali");
    private int totalhargaApel, totalhargaJeruk, totalhargaMangga;
    private int Apel, Jeruk, Mangga;
    private int jumlahApel, jumlahJeruk, jumlahMangga;
    
    public PurchacePage(String username, int totalhargaApel, int totalhargaJeruk, int totalhargaMangga, int Apel, int Jeruk, int Mangga, int jumlahApel, int jumlahJeruk, int jumlahMangga){
        this.totalhargaApel = totalhargaApel;
        this.totalhargaJeruk = totalhargaJeruk;
        this.totalhargaMangga = totalhargaMangga;
        this.Apel = Apel;
        this.Jeruk = Jeruk;
        this.Mangga = Mangga;
        this.jumlahApel = jumlahApel;
        this.jumlahJeruk = jumlahJeruk;
        this.jumlahMangga = jumlahMangga;
        
        int Subtotal = totalhargaApel+totalhargaJeruk+totalhargaMangga;
        double TotalPajak = Subtotal*(0.1);
        double TotalHarga = Subtotal + TotalPajak;
       
        
        setSize(400, 500);
        setLayout(null);
        setTitle("Halaman Pembelian");
        
        add(a);
        a.setText("Rincian Pembelian");
        a.setBounds(50, 50, 200, 30);
        
        add(apel);
        apel.setText("Apel: " + jumlahApel + " kg x Rp " + Apel + " = " + totalhargaApel);
        apel.setBounds(50, 80, 350, 30);
        
        add(jeruk);
        jeruk.setText("Jeruk: " + jumlahJeruk + " kg x Rp " + Jeruk + " = " + totalhargaJeruk);
        jeruk.setBounds(50, 110, 350,30);
        
        add(mangga);
        mangga.setText("Mangga: " + jumlahMangga + " kg x Rp " + Mangga + " = " + totalhargaMangga);
        mangga.setBounds(50, 140, 350,30);
        
        add(subtotal);
        subtotal.setBounds(50, 180, 300, 30);
        subtotal.setText("Subtotal: Rp " + Subtotal);
        
        add(pajak);
        pajak.setBounds(50, 210, 300, 30);
        pajak.setText("Pajak(10%): Rp " + TotalPajak);
        
        add(totalharga);
        totalharga.setBounds(50, 240, 300, 30);
        totalharga.setText("Total Harga: Rp " + TotalHarga);
        
        add(back);
        back.setBounds(50, 290, 275, 30);
        back.addActionListener(this);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == back){
                new HomePage("shofi");
                dispose();
            }
        }catch(Exception error){}
    }
}
