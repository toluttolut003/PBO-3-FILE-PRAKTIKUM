
package threadexam;

import java.util.Scanner;

public class ThreadExam {

    public static void main(String[] args) {
        // This is Main thread
        Scanner scanner = new Scanner(System.in);
//        myRunnable time = new myRunnable();
//        Thread thread = new Thread(time);
//        thread.setDaemon(true);
//        thread.start();
//        
//        System.out.println("anda punya waktu 5 detik untuk respons");
//        System.out.println("Masukan nama anda : ");
//        String name = scanner.nextLine();
//        System.out.println("Hello " + name);

       Thread thread  = new Thread(new MultiThread());
       Thread thread2 = new Thread(new MultiThread());
       Thread thread3 = new Thread(new MultiThread());
       Thread thread4 = new Thread(new MultiThread());
       
       thread.start();
       thread2.start();
       thread3.start();
       thread4.start();
    }
    
}
