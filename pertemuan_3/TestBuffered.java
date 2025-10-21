package pertemuan_3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestBuffered { //cara inputan yang lama
    //IOexception untuk menerima kesalahan
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //tidak bisa menerima string, tapi hanya bisa menerima byte, tapi dengan bufferedReader di konversi
        
        
        String nama;
        int umur;
        char kelas;
        double nilai;
        boolean status;
        
        System.out.print("masukan nama : ");
        nama = input.readLine(); //Untuk String
        System.out.println("Nama : " + nama);
        
        System.out.print("masukan umur : ");
        umur = Integer.parseInt(input.readLine());
        System.out.println("Umur : " + umur);
        
        System.out.print("masukan kelas : ");
        kelas = input.readLine().charAt(0); //untuk char
        System.out.println("Kelas : " + kelas);
        
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("dataMahasiswa.dat"));
        dos.writeUTF(nama);
        dos.writeInt(umur);
        dos.writeChar(kelas);
        dos.close();
        
        System.out.println("Data Berhasil di simpan");
        
        //membaca filenya
        DataInputStream dis = new DataInputStream(new FileInputStream("dataMahasiswa.dat"));
        nama = dis.readUTF();
        umur = dis.readInt();
        kelas = dis.readChar();
        dis.close();
        
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Kelas : " + kelas);
        
    }
    //DATAOUTPUTSTREAM -> Menyimpan file//untuk memasukan data kedalam file yang bentuknya biner
//    DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"));
   
    
}
