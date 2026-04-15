public class runnthread  implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        runnthread rt = new runnthread();
        Thread t1 = new Thread(rt);
        Thread t2 = new Thread(rt); 
        t1.start();
        t2.start();
    

    }
}
