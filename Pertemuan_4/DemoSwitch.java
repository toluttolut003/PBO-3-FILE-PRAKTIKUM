
package Pertemuan_4;

import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan angka hari: ");
        int hari = scanner.nextInt();
        
        switch(hari){
            case 1:
                System.out.println("Hari ini adalah Senin");
                break;
            case 2:
                System.out.println("Hari ini Praktikum");
                break;
            case 3:
                System.out.println("Hari ini adalah Rabu");
                break;
            case 4:
                System.out.println("Hari ini adalah Kamis");
                break;
            case 5:
                System.out.println("Hari ini adalah Jumat");
                break;
            case 6:
                System.out.println("Hari ini adalah Sabtu");
                break;
            case 7:
                System.out.println("Hari ini adalah Minggu");
                break;
            default:
                System.out.println("Input tidak valid");
        }
    }
 
}
