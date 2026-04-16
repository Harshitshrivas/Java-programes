
class Counter{

    int count = 0;

    synchronized void increment(){
        count ++;
    }

}

public class multi {
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {

        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() { //  old way to create thread
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(() -> {  // Lambda expression 
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();  // Start both threads

        try {
            t1.join();    // Wait for t1 to finish
            t2.join();    // Wait for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + c.count);  // Should be 2000 if synchronization works correctly
    }
}
