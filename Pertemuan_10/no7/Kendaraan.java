
package no7;

public class Kendaraan {
    String model;
    
    void informasi(){
        System.out.println("Model kendaraan : " + model);
    }
}

class Mobil extends Kendaraan{
    String nama,jenis;
    
    @Override
    void informasi(){
        System.out.println("Model kendaraan : " + model);
        System.out.println("nama kendaraan : " + nama);
        System.out.println("jenis kendaraan : " + jenis);
    }
}

class Pesawat extends Kendaraan{
    String nama, jenis;
    
    @Override
    void informasi(){
        System.out.println("Model kendaraan : " + model);
        System.out.println("nama kendaraan : " + nama);
        System.out.println("jenis kendaraan : " + jenis);
    }
}

class KapalLaut extends Kendaraan{
    String nama,jenis;
    
    @Override
    void informasi(){
        System.out.println("Model kendaraan : " + model);
        System.out.println("nama kendaraan : " + nama);
        System.out.println("jenis kendaraan : " + jenis);
    }
}
