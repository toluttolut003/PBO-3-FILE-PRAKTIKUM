
package no2;

public class DataUniv implements UnivFun{
    
    String nama,alamat,telepon,provinsi,negara;

    public DataUniv(String nama, String alamat, String telepon, String provinsi, String negara) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.provinsi = provinsi;
        this.negara = negara;
    }
    
    
    
    @Override
    public void Data() {
        System.out.println("Nama Universitas  : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Telepon : " + telepon);
        System.out.println("Provinsi : " + provinsi);
        System.out.println("Negara : " + negara);
    }
    
}

interface UnivFun {
    public void Data();
}

class main {
    public static void main(String[] args) {
        System.out.println("////////DATA UNIVERSITAS CIANJUR///////////");
        DataUniv d = new DataUniv("Universitas Suryakancana", "Pasir Gede", "08123-3210-3123", "Jawa Barat", "Indonesia");
        d.Data();
    }
}