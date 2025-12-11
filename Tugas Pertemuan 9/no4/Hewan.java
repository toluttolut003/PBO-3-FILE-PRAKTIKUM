/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no4;

/**
 *
 * @author Tolut
 */
public class Hewan {
    String nama;
    
    void makan(){
        System.out.println("hewan ini sedang makan");
    }
}

class kucing extends Hewan {
    
    void display () {
        System.out.println("nama hewan ini : " + nama);
    }
}
