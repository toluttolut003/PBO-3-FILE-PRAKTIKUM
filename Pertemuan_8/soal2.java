//hitung bilangan berpangkat
package praktikum_8;


public class soal2 {
    private int value,pangkat;
    
    public soal2(int value, int pangkat) {
        this.value = value;
        this.pangkat = pangkat;
    }
    
    public int hitung (){
        int temp = value;
        for (int i = 1; i < pangkat; i++){
            value = value * temp;
        }
        return value;
    }
    
}
