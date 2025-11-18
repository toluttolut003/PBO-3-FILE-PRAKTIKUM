package Pertemuan_7;

public class main {
    
    public static void main(String[] args) {
        //pembuatan objek disebut instansiasi
        Hewan h1 = new Hewan("kucing", "Carnivore", 2.00, 2);
//        h1.nama = "kucing";
        System.out.println( h1.nama + " ini sedang makan");
//        h1.jenis = "Carnivore";
//        h1.berat = 2.00;
//        h1.tinggi = 2;
        h1.makan("Daging");
        h1.berkembang_biak();
        h1.bernafas();
        System.out.println("bmi nya : " + h1.BMIhewan());
        
        //agregasi
        Mahasiswa mhs = new Mahasiswa("Jubaeda");
        dosen dosen = new dosen("Pak Tarmin");
        Mahasiswa mhs2 = new Mahasiswa("Ninil Kopake");
        jurusan jr = new jurusan("Computer Engineer");
        dosen.mengajar(mhs);
        System.out.println("///////////////////////////////////");
        //Asosiasi
        jr.tambahMhs(mhs);
        jr.tambahMhs(mhs2);
        jr.tampilMhs();
        
        //Agregasi (pakai diamon garis nya)
        //objek pada class nya sebagai atribut si class
        //objek tidak akan bisa di buat tanpa class lain yg membangun atribut si class
        Komputer k = new Komputer(new Monitor("Acer"), new processor("Itel"));
        k.tampil();
    }
    
}