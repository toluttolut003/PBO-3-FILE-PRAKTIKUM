package no1;


class Hewan {
    String hewan1 = "Hewan berkaki dua";
    String hewan2 = "Hewan berkaki enam";
    String hewan3 = "Hewan berkaki empat";
    String hewan4 = "Hewan berkaki delapan";
    
    public void out(){
        System.out.println("Macam-Macam Hewan : ");
        System.out.println(hewan1);
        System.out.println(hewan2);
        System.out.println(hewan3);
        System.out.println(hewan4);
    }
}

class Spesies extends Hewan {
    
    @Override
    public void out(){
        System.out.println("Contoh Hewan : ");
        System.out.println(hewan1 + ": kangguru, ayam, bebek, dll");
        System.out.println(hewan2 + ": capung, nyamuk, kupu-kupu, dll");
        System.out.println(hewan3 + ": kucing, anjing, kuda, dll");
        System.out.println(hewan4 + ": kepiting, belalang, laba-laba, dll");
    }
}
