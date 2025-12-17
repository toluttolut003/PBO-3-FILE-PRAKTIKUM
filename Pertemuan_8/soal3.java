
package praktikum_8;

import java.util.ArrayList;
import java.util.List;

public class soal3 {
    private int bil;

    public soal3(int bil) {
        this.bil = bil;
    }
    
    public void turnbiner(){
        List<Integer> binaryStore = new ArrayList<>();
        int i = 0;
        while (bil != 0){
            int binary = bil % 2 ;
            binaryStore.add(binary);
            bil = bil / 2;
            i++;
        }
        
        for (int in = binaryStore.size()-1; in >= 0; in--){
            System.out.print(binaryStore.get(in));
        }
        
        System.out.println();
        
    }
    
    
}
