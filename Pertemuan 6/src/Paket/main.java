package Paket;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperasiArr show = new OperasiArr();
        
        
        //SOAL NO 1
        System.out.println("SOAL NO 1");
        int[] arr1 = {1,2,3,4};
        int arr2[] = {1,2,3,4};
        int[] arr3 = new int[4]; //nge assign 4 slot
        arr3[0] = 1; arr3[1] = 2; arr3[2] = 5; arr3[3] = 12;
        show.out(arr1);
        show.out(arr2);
        show.out(arr3);
        System.out.print("\n"); 
        
        
        //SOAL NO 2
        System.out.println("SOAL NO 2");
        //diketahui :
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
        System.out.println("Sebelum di rubah : ");
        show.out(mobil);
        System.out.println("Setelah Di Reassign");
        mobil[1] = "-Suzuki Terjual!-";
        show.out(mobil);
        System.out.print("\n"); 
        
        
        //SOAL NO 3
//        System.out.println("PROGRAM INPUT ELEMEN ARRAY");
//        System.out.println("SOAL NO 3");
//        System.out.print("Masukan Jumlah Array : ");
//        int jum = scanner.nextInt();
//        int arr4[] = new int[jum];
//        show.inputno3(arr4, jum);
//        show.out(arr4);
//        show.operasino3(arr4);
//        System.out.print("Element Terurut : ");
//        show.sort(arr4);
//        System.out.print("\n"); 
        
        //SOAL NO 4
        System.out.println("SOAL NO 4");
        System.out.println("////////PEROGRAM NILAI MAHASISWA////////");
        System.out.println("Masukan Banyak Mahasiswa : ");
        
        
        
        
    }
}


////////////////////////////METHOD//////////////////////////////////////
class OperasiArr {
     Scanner scanner = new Scanner(System.in);
    //////////////////////////////////////////////////////////////////////////////  
   
    public void out(int[] arr){
        System.out.print("element dari si Array : ");
        for (int num : arr){
            System.out.print(" " + num);
        }
        System.out.print("\n");
    }
    
    public void out(String[] arr){
        System.out.print("element dari si Array : ");
        for (String num : arr){
            System.out.print(" " + num);
        }
        System.out.print("\n");
    }
    
  //////////////////////////////////////////////////////////////////////////////  
    public void inputno3(int[] arr, int jum){
        
        for (int i = 0; i < jum; i++){
            System.out.print("Masukan elemen array index ke -" + i + " : ");
            arr[i] = scanner.nextInt();
        }
        
    }
    ///PENJUMLAHAN SEMUA ELEMEN INDEX
    public void operasino3(int[] arr){
            
        int jumlah = 0;
        int jumGenap = 0; //karena npm saya 5520124031 (ganjil)
        int terbesar = arr[0];
        int terkecil = arr[0];
        int idxTb = 0;
        int idxTk = 0;
        for (int i = 0; i < arr.length; i++){
            jumlah = jumlah + arr[i];
            if (arr[i] % 2 == 0){
                jumGenap = jumGenap + arr[i];
            }
            if (arr[i] >= terbesar){
                terbesar = arr[i];
                idxTb = i;
            }
            if (arr[i] <= terkecil){
                terkecil = arr[i];
                idxTk = i;
            }
        }
        
        
        
        int avg = jumlah / arr.length;
            System.out.println("Nilai Terbesar array : " + terbesar + " (pada index ke "+ idxTb + " )");
            System.out.println("Nilai Terbesar array : " + terkecil + " (pada index ke "+ idxTk + " )");
            System.out.println("Hasil Penjumlahan Semua element adalah : " + jumlah + " ( Dengan nilai rata-rata " + avg + " )");
            System.out.print("Hasil Penjumlahan Semua element Genap  : " + jumGenap + " ");
            if (jumGenap % 2 > 0){
                System.out.println("(Ganjil)");
            } else {
                System.out.println("(Genap)");
            }
    }
    
    public void sort(int[] arr){
        
        for (int i = 0; i < arr.length; i++){
            for (int k = i+1; k < arr.length; k++){
                if (arr[i] > arr[k]){
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        
        for (int num : arr){
            System.out.print(num + " ");
        }
        
    }
    
  //////////////////////////////////////////////////////////////////////////////
    
    
}
