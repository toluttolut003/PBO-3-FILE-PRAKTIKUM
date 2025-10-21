
package Pertemuan_4;

import java.util.Scanner;

public class DemoSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        
        System.out.println("Masukkan angka hari: ");
        int hari = scanner.nextInt();
        
        switch(hari){
            case 1,2,3,4,5 -> System.out.println("Ini Hari kerja");
            case 6,7 -> System.out.println("Ini Hari Libur");
            default -> System.out.println("Input Tidak Valid 1-7");
        }
        
        
    }
}
