
package Pertemuan_7;

//asosiasi

import java.util.ArrayList;

//jurusan memiliki atribut dari si objek
public class jurusan {
    String nama;
    ArrayList<Mahasiswa> listMhs;

    public jurusan(String nama) {
        this.nama = nama;
        this.listMhs = new ArrayList<>();
    }
    
    void tambahMhs(Mahasiswa mhs){
        listMhs.add(mhs);
    }
    
    void tampilMhs () {
        System.out.println(" Daftar mahasiswa di " + nama);
        for (Mahasiswa m : listMhs){
            System.out.println("- " + m.nama);
        }
    }
    
    
}
