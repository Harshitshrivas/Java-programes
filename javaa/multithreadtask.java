 class Downloadtask implements Runnable{

    @Override
    @SuppressWarnings("CallToPrintStackTrace")
    public void run(){
        for(int i =0; i<=5; i++){
            System.out.println("Downloading File....." + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 } 

 class ProcessingTask implements Runnable{

    @Override
    @SuppressWarnings("CallToPrintStackTrace")
     public void run(){
        for(int i =0; i<=5; i++){
            System.out.println("Processing File....." + i);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 }

public class multithreadtask {
  
    public static void main(String[] args) {
        
       Thread t1 = new Thread(new Downloadtask());
       Thread t2 = new Thread(new ProcessingTask());
       t1.start();
       t2.start();

       
       for(int i =0; i<=5; i++){
        System.out.println("Main Thread is Working....." + i);
       try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
             System.out.println("Thread ruk gaya");
            }
       }
        System.out.println("All Task Started...");
    }
}
