package pertemuan_3;
 //3 fungsi input
    //-input St
import java.util.Scanner; //klik pada lampu kuning

    //-Input scanner
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner nama_scanner = new
        //harus di buat dulu objeknya
        
        String nama;
        int umur;
        char kelas;
        double nilai;
        boolean status;
        
        System.out.print("Masukan nama : ");
        nama = input.nextLine(); //untuk String
        System.out.println("nama : " + nama);
        
        System.out.print("Masukan umur : ");
        umur = input.nextInt(); //untuk integer
        System.out.println("Umur :" + umur);
        
        System.out.print("Masukan kelas : ");
        kelas = input.next().charAt(0); //untuk char, 0 karena dari index 0 jadi ketika di ketika ABCD hanya akan menerima index ke 0 yaitu A
        System.out.println("Kelas : " + kelas);
        
        System.out.print("Mauskan Nilai : ");
        nilai = input.nextDouble();
        System.out.println("Nilai : " + nilai);
        
        System.out.print("Masukan Status : ");
        status = input.nextBoolean();
        System.out.println("Status : " + status);
        
    }
}
