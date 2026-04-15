public class threddd extends Thread {

    @Override
    public void run(){
        System.out.println("Thread is running...");
    }
    
    public static void main(String[] args) {
        threddd t1 = new threddd();
        t1.start();
        
    }
}
