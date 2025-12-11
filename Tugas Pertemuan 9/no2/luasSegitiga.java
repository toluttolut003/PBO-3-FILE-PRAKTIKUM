
package no2;

public class luasSegitiga {
    protected double alas,tinggi;
    
    void set(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    double getHasil(){
    double hasil = 0.5 * this.alas * this.tinggi;
    return hasil;
    }
    
}
