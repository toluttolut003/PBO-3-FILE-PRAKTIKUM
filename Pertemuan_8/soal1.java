///program hitung faktorial
package praktikum_8;

public class soal1 {
    private int faktorial;

    public soal1(int faktorial) {
        this.faktorial = faktorial;
    }
    
    public int hitung (){
        int hasil = 1;
        
        for (int i = 1; i <= faktorial; i++){
            hasil = hasil * i;
        }
        
        return hasil;
    }
    
}
