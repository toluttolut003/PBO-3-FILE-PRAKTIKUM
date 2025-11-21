package Pertemuan_7;

public class dosen {
    String nama;

    public dosen(String nama) {
        this.nama = nama;
    }
    
    
    public void mengajar(Mahasiswa mhs){
        System.out.println(nama + " mengajar " + mhs.nama);
    }
    
    
}
