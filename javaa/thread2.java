public class thread2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        thread2 t1 = new thread2();
        thread2 t2 = new thread2();

        // t1.run();
        // t2.run(); // run method call karne se thread create nahi hoga aur dono thread
        // sequentially 0 se 5 print karega aur fir terminate ho jayega
        t1.start();
        t2.start();// start method call karne se thread create hoga aur run method execute hoga aur
                   // dono thread concurrently 0 se 5 print karega aur fir terminate ho jayega
    }
}
