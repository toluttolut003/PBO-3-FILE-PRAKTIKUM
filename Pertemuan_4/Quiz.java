package Pertemuan_4;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("buat menu pesanan");
        System.out.println("1.Bakso");
        System.out.println("2.Mie Ayam");
        System.out.println("3.Es Teler");
        
        System.out.print("Masukan pesanan anda (1-3) : ");
        int pilihan = scanner.nextInt();
       
        
        switch (pilihan) {
            case 1:
                System.out.println("Anda memesan Bakso");
                break;
            case 2:
                System.out.println("Anda memesan Mie ayam");
                break;
            case 3:
                System.out.println("Anda memesan Es Teler");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}
