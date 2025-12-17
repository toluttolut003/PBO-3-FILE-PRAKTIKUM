package no1;

public class Bentuk {
    
    void luas (){
        System.out.println("ini luas bentuk");
    }
    
}

class PersegiPanjang extends Bentuk {
    double panjang,lebar,luas;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    void luas(){
        luas = panjang*lebar;
        System.out.println("luas persegi panjang : " + luas);
    }
}

class BujurSangkar extends Bentuk {
    double sisi,luas;

    public BujurSangkar(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    void luas (){
        luas = sisi*sisi;
        System.out.println("Luas Bujur Sangkar : " + luas);
    }
    
}

class Segitiga extends Bentuk {
    double alas,tinggi,luas;
    
    void luas(){
        luas = 0.5*alas*tinggi;
        System.out.println("Luas Segitiga : " + luas);
    }
}

class Lingkarang extends Bentuk {
    double jarijari,luas;
    
    @Override
    void luas(){
        luas = 3.14 * (jarijari*jarijari);
        System.out.println("Luas lingkaran : " + luas);
    }
}