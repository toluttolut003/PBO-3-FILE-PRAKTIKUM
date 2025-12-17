/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no4;

import no3.*;

/**
 *
 * @author Tolut
 */

public class Produk {
    protected String judul,penulis;

    public Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
    
    void getInfoProduk(){
        System.out.println("PRODUK");
        System.out.println("Judul           : " + judul);
        System.out.println("penulis         : " + penulis);
    }
    
}

class komik extends Produk{
    int jumlahHalaman;
    public komik(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }
    
    @Override
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
    
    @Override
    void getInfoProduk(){
        System.out.println("games");
        System.out.println("Judul       : " + judul);
        System.out.println("penulis     : " + penulis);
        System.out.println("Waktu Main  : " + waktuMain + " jam");
    }
    
}

class main {
    public static void main(String[] args) {
        Produk p1 = new Produk("TUGAS 10", "Tolut");
        games g1 = new games("Gigantic OTN", "Roel", 12);
        komik k1 = new komik("THE STRONGEST HERO", "ONE", 120);
        g1.getInfoProduk();
        System.out.println("");
        k1.getInfoProduk();
        System.out.println("");
        p1.getInfoProduk();
    }
}