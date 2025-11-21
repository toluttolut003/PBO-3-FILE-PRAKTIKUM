
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("//////NO 1");
        //NO 1
        //1.Jelaskan mekanisme Class menjadi sebuah Objek
        //ini adalah pembuatan objek baru dengan nama MyObj dari kelas myClass :
        myClass myObj = new myClass("Emil");
        //pertama di sebutkan nama class nya, lalu nama object nya, kemudian create new objek nya
        //kemudian pada constructor di masukan atribut nama si objek tersebut
        //kemudian kita bisa panggil method nya 
        myObj.out();
        System.out.println("\n\n///NO 2");
        
        //NO 2
        //pembuatan objek hitung keliling
        HitungKel keliling = new HitungKel(2,5);
        //keluarkan method nya
        keliling.out();
        System.out.println("\n\n///NO 3");
        
        //NO 3
//        System.out.println("Saya akan menebak tanggal dan bulan lahir anda");
//        System.out.println("Siapkan alat tulis untuk menghitung");
//        System.out.println("1.Kalikan no bulan lahir anda dengan 2");
//        System.out.println("2.Tambahkan Dengan 5");
//        System.out.println("3.Kalikan dengan 50");
//        System.out.println("4.Sekarang Tambahkan dengan tanggal lahir kamu");
//        System.out.print("Masukan Hasil dari hitung tersebut : ");
//        int hasil = scan.nextInt();
//        Tebak tebak = new Tebak(hasil);
//        System.out.println("Bulan dan tanggal lahir anda adalah : " + tebak.hasil() + " (bulanTgl)");
        
        //NO 4
//        System.out.println("\n\n///NO 4");
//        sumpahPemuda sp = new sumpahPemuda("Kami Putra dan Putri Indonesia, mengaku bertumpah darah yang satu, tanah air indonesia");
//        sp.lanjutan();
        
        //NO 5
//        System.out.println("\n\n///NO 5");
//        rekursif rk = new rekursif();
//        System.out.println(rk.hitung(2));
        
        //NO 6
        System.out.println("\n\n///NO 6");
        Civitas civic = new Civitas("Civitac Academis Fakultas Teknik"); 
        mahasiswa mhs = new mahasiswa("Emilia", civic.get());
        staff staf = new staff("Abdul", civic.get());
        dosen dsn = new dosen("Lalan Jaelani", civic.get());
        
        System.out.println("Dosen  : " + dsn.get());
        System.out.println("Status : " + dsn.getciv());
        System.out.println("Mhs    : " + mhs.get());
        System.out.println("Status : " + mhs.getciv());
        System.out.println("Staff  : " + staf.get());
        System.out.println("Status : " + staf.getciv());
        
        //NO 7
        System.out.println("\n\n///NO 6");
        mhsID mhs1 = new mhsID();
        mhs1.in();
        mhs1.out();
        
    }
    
}


class myClass {
    //pembuatan class dengan atribute nama dan method mengeluarkan nama
    String nama;

    public myClass(String nama) {
        this.nama = nama;
    }
    
    public void out(){
        System.out.println("Nama saya " + nama);
    }
    

}

class HitungKel {
    double panjang;
    double lebar;

    public HitungKel(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void out (){
        
        double hasil = 2*(panjang*lebar);
        System.out.println("Keliling nya adalah : " + hasil);
    }
    
}

class Tebak {
    int total;
    
    public Tebak(int total) {
        this.total = total;
    }
    
    public int hasil(){
        return total-250;
    }
    
}

class sumpahPemuda {
    String sp;

    public sumpahPemuda(String sp) {
        this.sp = sp;
    }
    
    public void lanjutan (){
        System.out.println(sp);
        System.out.println("Kami putra dan putri indonesia, Mengaku berbangsa satu, Bangsa indonesia");
        System.out.println("Kami putra dan putri indonesia, Menjunjung Bahasa persatuan, Bahasa indonesia");
    }
}

class rekursif{
    
    int hitung (int k){
      if (k > 0) {
      return k + hitung(k - 1);
        } else {
      return 0;
        }
    }
    
}

class mhsID {
    private String nama;
    private String NPM;
    private String kelas;
    Scanner scanner = new Scanner (System.in);
    
    void in(){
        System.out.print("Masukan nama : ");
        String n = scanner.nextLine();
        setNama(n);
        System.out.print("Masukan NPM   : ");
        String npm = scanner.nextLine();
        setNpm(npm);
        System.out.print("Masukan Kelas : ");
        String kls = scanner.nextLine();
        setKelas(kls);
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    void setNpm(String npm){
        this.NPM = npm;
    }
    
    void setKelas (String kls){
        this.kelas = kls;
    }
    
    void out(){
        System.out.println("ID Mahasiswa");
        System.out.println("nama  : " + this.nama);
        System.out.println("NPM   : " + this.NPM);
        System.out.println("Kelas : " + this.kelas);
    }
    
}