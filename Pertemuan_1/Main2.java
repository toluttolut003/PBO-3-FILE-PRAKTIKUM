/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_1;

/**
 *
 * @author Jarkom-12
 */
public class Main2 {
//    bukan fungsi main hanya nama saja
//    pada java command nya "public static main"
//    shortcut nya psvm >>>lalu tab<<</ bisa juga sout untuk system out
    public static void main(String[] args) {
        var kesatu = 5;
        var kedua = 90;
        System.out.println("Hello World" + " also"+ " sup world");
        System.out.println(kesatu*kedua);
        //println untuk memisah, print untuk menyatukan
        System.out.print("Hello World" + " also"+ " sup world");
        System.out.print(kesatu*kedua);
        System.out.println("");
        //namKelas namaObj = new namaKelas();
        Kendaraan mobil = new Kendaraan();
        //untuk memanggil atribut memakai . (asesor)
        mobil.warna = "Merah";
        mobil.lampu = 4;
        System.out.println("Kendaraan berwarna " + mobil.warna);
        mobil.menyala();
    }
}

//biasakan nama class diawali huruf kapital
//tipedata nama_variable;
class Kendaraan{
    String mesin, merk, warna;
    int lampu;
    double kecepatan;
    //prosedur pake void
    void menyala () {
        System.out.println("Kendaraan ini menyala");
    }
    double Maju (){
        return kecepatan;
    }
    

}
