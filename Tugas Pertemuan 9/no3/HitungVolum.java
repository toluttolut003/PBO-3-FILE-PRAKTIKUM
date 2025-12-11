
package no3;

import java.util.Scanner;

public class HitungVolum {
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public void hitung(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan panjang sisi kubus : ");
        double input = scan.nextDouble();
        setSisi(input);
        double s = getSisi();
        double hasil = s * s * s;
        System.out.println("Volume dari kubus adalah : "+hasil);
    }
    
    
}
