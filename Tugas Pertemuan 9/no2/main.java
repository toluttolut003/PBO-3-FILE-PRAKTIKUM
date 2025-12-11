/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no2;

import java.util.Scanner;

/**
 *
 * @author Tolut
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        luasSegitiga ls = new luasSegitiga();
        System.out.print("Masukan alas : ");
        double alas = scanner.nextDouble();
        System.out.print("Masukan tinggi : ");
        double tinggi = scanner.nextDouble();
        ls.set(alas, tinggi);
        System.out.println("Luas nya : " + ls.getHasil());
    }
}
