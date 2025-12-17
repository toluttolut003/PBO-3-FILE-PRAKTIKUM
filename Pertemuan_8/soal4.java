
package praktikum_8;

public class soal4 {
    Double hargaBarang,jumlahBarang,Diskon;

    public soal4(Double hargaBarang, Double jumlahBarang, Double Diskon) {
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.Diskon = Diskon;
    }

    
    
    public soal4(Double hargaBarang, Double jumlahBarang) {
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
    }
    
    public soal4(Double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
    
    public void hitungTotal(){
        double total;
        total = hargaBarang*jumlahBarang;
        Diskon = (Diskon/100)*total;
        total = total - Diskon;
        System.out.println("Total harga : " + total);
    }
    
    
    
}
