package Pertemuan_7;

public class Hewan {
    String nama;
    String jenis;
    double berat;
    double tinggi;

    public Hewan(String nama, String jenis, double berat, double tinggi) {
        this.nama = nama;
        this.jenis = jenis;
        this.berat = berat;
        this.tinggi = tinggi;
    }
    
    //constructor
    //dipanggil ketika objek dibuat 
//    public Hewan(){
//        System.out.println("Hewan dibuat");
//    }
    
    public void makan(String makanan){
        System.out.println("Sedang makan : " + makanan);
        System.out.println("nom nom nom");
        System.out.println("jenisnya " + jenis);
    }
    
    public void berkembang_biak(){
        System.out.println("HEWAN INI BISA BERMITOSISS");
    }
    
    public void bernafas(){
        System.out.println("TARIK NAFASSS.....KELUAR-");
    }
    
    double BMIhewan(){
        double bmi = berat/tinggi*tinggi;
        return bmi; 
    }
    
}
