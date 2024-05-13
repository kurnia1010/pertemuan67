/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latpertemuan6;

import com.person.person;

/**
 *
 * @author A-28
 */
public class latihan {
    public static void main(String[] args) {
        System.out.println("Latihan Kelas: ");
        String judulbuku1 = "Java 1";
        String authorbuku1 = "Dian";
        String judulbuku2 = "Java 2";
        String authorbuku2 = "Kurnia";
        System.out.println("judulbuku1");
        System.out.println("authorbuku1");
        System.out.println("judulbuku2");
        System.out.println("authornuku2");
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        buku1.judul = "Java 1";
        buku1.author.nama = "Dian dari buku 1";
        buku2.judul = "Java 2";
        buku2.author.nama = "Kurnia";
        
        System.out.println("buku1.judul");
        buku1.author.sebutNama();
        System.out.println("buku1.author");
        System.out.println("buku2.judul");
        System.out.println("buku2.author");  
        System.out.println("buku1.tahunpenerbitan");
        System.out.println("buku1.harga.beli");
        System.out.println("buku1.penerbit.nama");
       
        
        
    }
}

class Buku{
   String judul;
   person author = new person();
   int tahunpenerbitan = 2023;
   Harga harga = new Harga();
   perusahaanbuku penerbit = new perusahaanbuku();
}

class Harga{
    double jual = 100000.00;
    double beli = 80000.00;
}