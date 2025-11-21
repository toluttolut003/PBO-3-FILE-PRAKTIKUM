package threadexam;

public class myRunnable extends Thread {
    
    
    public void run (){
        for (int i = 0; i <= 5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("Thread Terganggu");
            }
            if (i == 5){
                System.out.println("Timed Out!");
                System.exit(0);
            }
        }
    }
    
}
