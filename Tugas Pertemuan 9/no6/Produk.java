/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no6;

import no5.*;

/**
 *
 * @author Tolut
 */
public class Produk {
    String judul,penulis;

    public Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
    
    
}

class komik extends Produk{
    int jumlahHalaman;
    public komik(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }
    
    void getInfoProduk(){
        System.out.println("KOMIK");
        System.out.println("Judul           : " + judul);
        System.out.println("penulis         : " + penulis);
        System.out.println("jumlah halaman  : " + jumlahHalaman + " Page");
    }
    
}

class games extends Produk {
    int waktuMain;
    public games(String judul, String penulis, int waktuMain) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }
    
    void getInfoProduk(){
        System.out.println("games");
        System.out.println("Judul       : " + judul);
        System.out.println("penulis     : " + penulis);
        System.out.println("Waktu Main  : " + waktuMain + " jam");
    }
    
}