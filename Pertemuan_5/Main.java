
package Pertemuan_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //no 1
//        TerbesarTerkecil tb = new TerbesarTerkecil();
//        tb.input();

        //no2
//          PenjumlahanArray pj = new PenjumlahanArray();
//          pj.input();

        //no 3
//            FloydTriangle ft = new FloydTriangle();
//            ft.input();

        //no4
//            TampilGanjil tg = new TampilGanjil();
//            tg.input();

        //no5
//            Segitiga sg = new Segitiga();
//            sg.HalfTriangle();
//            System.out.println("\n\n");
//            sg.FullTriangle();

        //no 6
//        NomerEnam en = new NomerEnam();
//        en.fungsi();

        //no 7
//        IncrementDecrement id = new IncrementDecrement();
//        id.increment();

        //no 8
        foreach fr = new foreach();
        fr.forEach();
    }
}

/////NOMER 1
class TerbesarTerkecil {
        Scanner scanner = new Scanner(System.in);
        
        public void input() {
            int[] arr = new int[10];
            
            System.out.println("/////PROGRAM HITUNG TERBESAR TERKECIL///////");
            for (int i = 0; i < 10; i++){
                System.out.print("Masukan angka ke " + (i+1) + " : ");
                arr[i] = scanner.nextInt();
            }
            
            int besar = 0;
            int kecil = arr[0];
            
            for (int i = 0; i < 10; i++) {
                if (besar < arr[i]){
                    besar = arr[i];
                }
                
                if (kecil > arr[i]) {
                 kecil = arr[i];
                }
            }
            
            System.out.println("Bilangan Terbesar : " + besar);
            System.out.println("Bilangan Terkecil : " + kecil);
            
        }
}

////NOMER 2
class PenjumlahanArray {
    Scanner scanner = new Scanner(System.in);
    
    public void input (){
        
        System.out.print("Masukan Jumlah Inputan : ");
        int in = scanner.nextInt();
        int[] arr = new int[in];
        int total = 0;
        
        for (int i = 0; i < in; i++){
            System.out.print("masukan angka ke -" + (i+1) + " : ");
            arr[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < in; i++){
            total = total + arr[i];
        }
        
        System.out.println("Total Jumlah Bilangan    : " + total);
        double rarata = total/in;
        System.out.println("Rata-rata Bilangan       : " + rarata);
        
    }
    
    
}

////NOMER 3
class FloydTriangle {
    Scanner scanner = new Scanner(System.in);
    
    public void input (){
        int in;
        int prev = 1;
        System.out.print("Masukan Banyak baris : ");
        in = scanner.nextInt();
        
        for (int i = 0; i < in; i++) {
            
            for(int k = 0; k <= i; k++){
                System.out.print (prev + " ");
                prev++;
            }
            System.out.println(" ");
            
        }
        
    }
}

////NOMER 4
class TampilGanjil {
    Scanner scanner =  new Scanner(System.in);
    
    public void input (){
        int total = 0;
        System.out.print("Masukan Banyak angka : ");
        int in = scanner.nextInt();
        
        for (int i = 0; i < in; i++){
            if (i % 2 == 1) {
                System.out.print(i + " ");
                total = total + i;
            }
        }
        System.out.println("\nTotal Penjumlahan : " + total);
    }
    
}

////NOMER 5
class Segitiga {
    
    public void HalfTriangle(){
        
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                
                for (int l = 10; l >= i; l--){
                    System.out.print(" ");
                }
                
                for (int k = 0; k < i; k++) {
                    System.out.print("* ");
                } System.out.print("\n");
            }
        }
    }
    
    public void FullTriangle(){
        
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 1) {
                
                for (int l = 6; l >= i; l--){
                    System.out.print(" ");
                }
                
                for (int k = 0; k < i; k++) {
                    System.out.print("* ");
                } System.out.print("\n");
            }
        }
        
        for (int i = 3; i >= 0; i--) {
            if (i % 2 == 0) {
                
                for (int l = 5; l >= i; l--){
                    System.out.print(" ");
                }
                
                for (int k = 0; k <= i; k++) {
                    System.out.print("* ");
                } System.out.print("\n");
            }
        }
        
        
        
    }
    
}

////NOMER 6
class NomerEnam {
    public void fungsi () {
        
        for(int i = 0; i < 10; i++){
            if (i<2){
                System.out.println("11 ");
            }
        }
        
    }
}

////nomer 7
class IncrementDecrement {
    public void increment () {
        int i = 1;
        System.out.println("Ini adalah i++ (increment)");
        while (i<10){
            System.out.print(i + " ");
            i++;
        }
        i = 10;
        System.out.println("\nDan ini adalah i-- (decrement)");
        while (i>0){
            System.out.print(i + " ");
            i--;
        }
        
    }
}

//nomer 8
class foreach {
    public void forEach(){
        String arr[] = {"tolut", "Hyde"};
        for(String array : arr){
            System.out.print(array + " ");
        }
    }
}

