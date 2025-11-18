package Pertemuan_7;

public class Komputer {
    Monitor m;
    processor p;

    public Komputer(Monitor m, processor p) {
        this.m = m;
        this.p = p;
    }
    
    void tampil(){
        System.out.println("Detail Komputer : ");
        System.out.println("Monitor : " + m.merk);
        System.out.println("Processor : " + p.merk);
    }
}
