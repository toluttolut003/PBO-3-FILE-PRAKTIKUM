/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no5;

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
    
    public komik(String judul, String penulis) {
        super(judul, penulis);
    }
    
    void getInfoProduk(){
        System.out.println("KOMIK");
        System.out.println("Judul : " + judul);
        System.out.println("penulis : " + penulis);
    }
    
}

class games extends Produk {
    
    public games(String judul, String penulis) {
        super(judul, penulis);
    }
    
    void getInfoProduk(){
        System.out.println("games");
        System.out.println("Judul : " + judul);
        System.out.println("penulis : " + penulis);
    }
    
}