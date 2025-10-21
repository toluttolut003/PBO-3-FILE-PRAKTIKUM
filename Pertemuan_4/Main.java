
package Pertemuan_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan umur anda : ");
        int umur = scanner.nextInt();
        scanner.nextLine().trim();
        
        
        if (umur >= 17){
            System.out.print("Apakah anda memiliki member(ya/tidak): ");
        String member = scanner.nextLine().trim();
            if (member.equalsIgnoreCase("ya")){
                System.out.println("Anda mendapatkan diskon");
            } else if (member.equalsIgnoreCase("tidak")) {
                System.out.println("Buat member dulu..");
            } else;
        } else {
            System.out.println("Umur anda tidak memenuhi untuk mendapatkan diskon");
        }
        
        
        //catatan
        //memakai
    }
}
